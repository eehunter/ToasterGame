import kotlinx.html.div
import kotlinx.html.dom.append
import org.w3c.dom.Node
import kotlinx.browser.document
import kotlinx.browser.window


fun main() {
    //console.log("test")
    //window.onload = { document.body?.sayHello() }
    //monogatari.script(Scenes.toJsObject())
    //monogatari.characters()

}

@JsExport
fun getScenes() = Scenes.toJsObject()

@JsExport
fun getCharacters() = Characters.toJsObject()

external val monogatari: dynamic

object Show
object Hide
object Jump
object Set
object Narrator
class ChoiceBuilder: EventBuilder(){
    var dialog: StringEvent? = null
    val options = mutableListOf<Pair<String,dynamic>>()

    fun build(): JsEvent{
        val js = js("{}")
        js.Dialog = dialog!!.value
        options.forEach { js[it.first]=it.second }
        return JsEvent(objectEventLiteral("Choice",js))
    }
    //infix fun dynamic.dialogue(str: StringEvent) {this.Dialogue = str.value}
}
open class EventBuilder{
    infix fun Character.says(line: String) = StringEvent("${this.prefix} $line")
    infix fun Narrator.says(line: String) = StringEvent(line)
    infix fun Show.scene(bg: Background) = TransitionableEvent("show scene "+bg.name)
    infix fun Show.scene(bg: String) = Show scene Background(bg)
    infix fun Show.character(sprite: String) = TransitionableEvent("show character $sprite")
    infix fun Hide.character(sprite: String) = TransitionableEvent("hide character $sprite")
    infix fun Hide.character(character: Character) = Hide character character.prefix
    infix fun Jump.to(to: String) = StringEvent("jump $to")
}

open class Location(val str: String){ override fun toString(): String = str }

operator fun <T: StringEvent> T.plus(string: String):T {value+=string; return this}

infix fun <T: TransitionableEvent> T.with(transition: Transition):T{value+=" with $transition";return this}
infix fun <T: TransitionableEvent> T.and(transition: Transition):T{value+=" $transition";return this}
infix fun <T: TransitionableEvent> T.at(location: Location):T{value+=" with $location";return this}

fun objectEvent(type: String, content: (dynamic)->Unit): dynamic{
    val otpt = Any().asDynamic()
    val o = with(Any().asDynamic()) { content(it);it }
    js("otpt[type]=o")
    return otpt
}
fun objectEventLiteral(type: String, content: dynamic): dynamic{
    val otpt = Any().asDynamic()
    js("otpt[type]=content")
    return otpt
}
/*{
    val otpt = Any().asDynamic()
    otpt[type]=with(Any().asDynamic()){content(it);it}
    return otpt
}*/

/*
fun Node.sayHello() {
    append {
        div {
            +"Hello from JS"
        }
    }
}*/