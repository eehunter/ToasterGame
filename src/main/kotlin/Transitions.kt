@Suppress("ClassName")
object Transitions {
    val fadeIn = Transition("fadeIn")
    val fadeOut = Transition("fadeOut")
    val move = Transition("move")
    object transition{operator fun get(i: Any) = Transition("transition $i")}
    val center = Location("center")
    val left = Location("left")
    val right = Location("right")
}