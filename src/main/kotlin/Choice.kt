class Choice(val dialog: Event<String>? = null, val classes: String? = null, val options: Array<Option>): Event<dynamic> {
    override var value: dynamic = objectEvent("Choice"){ obj ->
            if(dialog != null)obj.Dialog = dialog.value
            if(classes != null)obj.Class = classes
            options.forEach { obj[it.name] = it.toJsObject() }
        }
}