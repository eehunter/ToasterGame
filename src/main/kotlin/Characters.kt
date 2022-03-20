object Characters: MutableList<Character> by mutableListOf() {
    val Alex = Character("a", "Alex", "#00ffff", "alex"){it.normal = "normal.png"}


    override fun toString(): String = joinToString(",","{","}")
    fun toJsObject(): dynamic{
        val otpt = Any().asDynamic()
        forEach { otpt[it.prefix] = it.json }
        return otpt;
    }
}