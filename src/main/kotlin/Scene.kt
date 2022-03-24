class Scene(val name: String, builder: Scene.()->Unit): MutableList<Event<*>> by mutableListOf() {
    //val objs = mutableListOf<Event>()
    init {this.builder();Scenes.add(this)}
    override fun toString(): String = joinToString(",","[","]")
    infix fun Character.says(line: String) {add(StringEvent("${this.prefix} $line"))}
    infix fun Narrator.says(line: String) {add(StringEvent(line))}
    val End get() = +StringEvent("end")
    operator fun Event<*>.unaryPlus() {add(this)}
    operator fun String.unaryPlus() {add(StringEvent(this))}
    fun toArray() = this.map { it.value }.toTypedArray()
    infix fun Show.scene(bg: Background): TransitionableEvent{val event = TransitionableEvent("show scene "+bg.name);this@Scene.add(event);return event}
    infix fun Show.scene(bg: String) = Show scene Background(bg)
    infix fun Show.character(sprite: String): TransitionableEvent{val event = TransitionableEvent("show character $sprite");this@Scene.add(event);return event}
    infix fun Hide.character(sprite: String): TransitionableEvent{val event = TransitionableEvent("hide character $sprite");this@Scene.add(event);return event}
    infix fun Hide.character(character: Character): TransitionableEvent = Hide character character.prefix
    infix fun Jump.to(to: String): StringEvent {val event = StringEvent("jump $to");this@Scene.add(event);return event}
    fun <T> BuildEvent(builder: EventBuilder.()->Event<T>){add(EventBuilder().builder())}
    fun Choice(builder: ChoiceBuilder.()->Unit){val cb = ChoiceBuilder();cb.builder();add(cb.build())}
    //interface ShowInternal {infix fun scene(bg:Background):TransitionableEvent;@JsName("sceneString") infix fun scene(bg: String):TransitionableEvent}
}