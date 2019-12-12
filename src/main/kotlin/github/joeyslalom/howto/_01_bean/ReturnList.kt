package github.joeyslalom.howto._01_bean

// List<String> -> class Fullname(first: String, last: String)
fun parseName(name: String): List<String> {
    val space = name.indexOf(' ')
    return listOf(
            name.substring(0, space),
            name.substring(space+1)
    )
}

fun main() {
    val name = parseName("Jane Doe")
    val first = name[0]
    val last = name[1]

    println("$first $last")

    if (name != parseName("Jane Doe")) {
        println("equals() doesn't work!")
    }
}