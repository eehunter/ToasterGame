class Character(val prefix: String, val name: String, val color: String, val directory: String? = null, spriteInit: (dynamic)->Unit) {
    val sprites = Any().asDynamic()
    init{spriteInit(sprites);Characters.add(this)}

    override fun toString(): String = "'$prefix':{name:'$name',color:'$color'}"

    val json: dynamic get() {val otpt = Any().asDynamic();otpt.name=name;otpt.color=color;otpt.sprites=sprites;if(directory!=null)otpt.directory=directory;return otpt}
    operator fun get(sprite: String) = "$prefix $sprite"
    operator fun get(sprite: SpriteID) = this[sprite.id]
    operator fun minus(sprite: String) = this[sprite]
    operator fun minus(sprite: SpriteID) = this[sprite]
}