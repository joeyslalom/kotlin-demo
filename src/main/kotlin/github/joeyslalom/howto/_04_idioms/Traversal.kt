package github.joeyslalom.howto._04_idioms

import java.lang.StringBuilder

fun main() {
    val root = Container(
            Text("a"),
            Container(
                    Text("b"),
                    Container(
                            Text("c"),
                            Text("d")
                    ),
                    Text("e")
            ),
            Text("f")
    )

    println(root.extractText())
}

abstract class Element
class Container(vararg val children: Element) : Element()
class Text(val text: String) : Element()

fun Element.extractText(): String {
    return extractText(this, StringBuilder()).toString()
}

fun extractText(e: Element, sb: StringBuilder): StringBuilder {
    if (e is Text) {
        val text = e as Text
        sb.append(text.text)
    } else if (e is Container) {
        val container = e as Container
        for (child in container.children) {
            extractText(child, sb)
        }
    } else error("Unrecognized element: $e")

    return sb
}