import java.io.File

fun main() {
    val input: List<String> = File("src /main/resources/day1.txt").useLines { it.toList() }
    println(partOne(input))
    println(partTwo(input))
}


fun partTwo(input: List<String>): String {
    val max = mutableListOf<Int>()
    var act = 0

    for (i in input) {
        if (i == "") {
            max.add(act)
            act = 0
            continue
        }
        act += i.toInt()
    }
    max.sortDescending()
    return max.subList(0,3).sum().toString()
}

fun partOne(input: List<String>): String {
    var max = 0
    var act = 0

    for (i in input) {
        if (i == "") {
            if (max < act) max = act
            act = 0
            continue
        }
        act += i.toInt()
    }

    return max.toString()
}

