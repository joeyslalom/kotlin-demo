package github.joeyslalom.howto._03_functions

// fix
class StringUtil {
    fun firstWord(s: String, separator: String): String {
        val index = s.indexOf(separator)
        return if (index < 0) s else s.substring(0, index)
    }

    fun firstWord(s: String) = firstWord(s, " ")
}

fun main() {
    println(StringUtil().firstWord("Jane Doe"))
}