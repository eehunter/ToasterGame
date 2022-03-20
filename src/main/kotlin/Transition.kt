open class Transition(val str: String) {
    override fun toString(): String = str
    operator fun plus(transition: Transition) = Transition("$str ${transition.str}")
    val end get() = Transition("end-$str")
}