class Option(val name: String, val text: String, val toDo: Event<*>, val classes: String? = null, val clickable: (dynamic.()->Boolean)? = null, val condition: (dynamic.()->Boolean)? = null, val onChosen: (dynamic.()->Unit)? = null, val onRevert: (dynamic.()->Unit)? = null) {

    fun toJsObject(){
        val otpt = Any().asDynamic()
        otpt.Text = text
        otpt.Do = toDo.value
        /*if(classes != null) otpt.Class = classes
        if(clickable != null) otpt.Clicable = clickable
        if(condition != null) otpt.Condition = condition
        if(onChosen != null) otpt.onChosen = onChosen
        if(onRevert != null) otpt.onRevert = onRevert*/
        return otpt
    }
    fun addTo(obj: dynamic){
        val otpt = Any().asDynamic()
        otpt.Text = text
        otpt.Do = toDo.value
        if(classes != null) otpt.Class = classes
        if(clickable != null) otpt.Clicable = clickable
        if(condition != null) otpt.Condition = condition
        if(onChosen != null) otpt.onChosen = onChosen
        if(onRevert != null) otpt.onRevert = onRevert
        obj[name] = otpt
    }
}