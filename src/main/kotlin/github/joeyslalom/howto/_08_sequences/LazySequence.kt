package github.joeyslalom.howto._08_sequences

fun main() {
    val seq = sequence {
        var a = 1
        var b = 1
        while(true) {
            yield(a)
            val tmp = a
            a = b
            b += tmp
        }
    }

    println(
            seq.take(20).toList()
    )
}