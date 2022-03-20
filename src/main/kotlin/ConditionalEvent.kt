class ConditionalEvent(vararg val results: Pair<String, Event<*>>, val condition: dynamic.()->Any): Event<dynamic> {
    override var value: dynamic
        set(_) {}
        get() = objectEvent("Conditional"){ obj ->
            obj.Condition = condition
            results.forEach { obj[it.first]=it.second.value }
        }
}