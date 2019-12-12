package github.joeyslalom.howto._02_properties

import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

var observeMe by Delegates.observable("a") {
    p, old, new -> println("${p.name} goes $old -> $new")
}

fun main() {
    println("Observable property: $observeMe")
    observeMe = "bb"
    observeMe = "ccc"
    observeMe = "dddd"
}



var p1 by Prop("initial")
var p2 by Prop("initial")
var p3 by Prop("initial")

class Prop(var field: String) : ReadWriteProperty<Any?, String> {
    override operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("You read me")
        return field
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("You write me")
        field = value
    }
}
