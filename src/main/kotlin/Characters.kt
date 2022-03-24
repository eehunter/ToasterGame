object Characters: MutableList<Character> by mutableListOf() {
    val chrisColor = "#cccccc"
    val Chris = Character("c","Chris", chrisColor, "chris"){}
    val Alex = Character("a", "Alex", "#00ffff", "alex"){it.normal = "normal.png"}
    val Eclipse = Character("e","Eclipse", "", "eclipse"){it.normal = "normal.png"}

    override fun toString(): String = joinToString(",","{","}")
    fun toJsObject(): dynamic{
        val otpt = Any().asDynamic()
        forEach { otpt[it.prefix] = it.json }
        return otpt;
    }
}