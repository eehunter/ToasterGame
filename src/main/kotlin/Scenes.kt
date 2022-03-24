import Characters.Alex
import Transitions.fadeIn
import Transitions.fadeOut

object Scenes: MutableList<Scene> by mutableListOf() {
    //override fun toString(): String = joinToString(",", "{", "}") { "${it.name}: $it" }
    init{
        /*Scene("Start"){
            Show scene "#f7f6f6" with fadeIn
            Show character Alex-"normal" with fadeIn and fadeOut.end
            Alex says "Hello, human."
            Alex says "This is a test."
            Choice {
                dialog = Alex says "This is a test choice"
                options.add("Yes" to js("{'Text':'Yes.','Do':'jump Yes'}"))
                options.add("No" to js("{'Text':'No.','Do':'jump No'}"))
            }
        }
        Scene("Yes"){
            Alex says "You answered 'Yes'."
            End
        }
        Scene("No"){
            Alex says "You answered 'No'."
            End

        }*/
    }
    fun toJsObject(): dynamic{
        val otpt = Any().asDynamic()
        forEach { otpt[it.name] = it.toArray() }
        return otpt
    }
}