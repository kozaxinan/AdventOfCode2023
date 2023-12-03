fun main() {
    fun part1(input: List<String>): Int {
        return input.sumOf { line ->
            val first = line.first(Char::isDigit)
            val last = line.last(Char::isDigit)
            "$first$last".toInt()
        }
    }

    fun part2(input: List<String>): Int {
        return input
            .map { it.replace("nine", "n9e") }
            .map { it.replace("eight", "e8t") }
            .map { it.replace("seven", "7n") }
            .map { it.replace("six", "6") }
            .map { it.replace("five", "5e") }
            .map { it.replace("four", "4") }
            .map { it.replace("three", "t3e") }
            .map { it.replace("two", "t2o") }
            .map { it.replace("one", "o1e") }
            .map { it.replace("zero", "0o") }.sumOf { line ->
                val first = line.first(Char::isDigit)
                val last = line.last(Char::isDigit)
                "$first$last".toInt()

            }
    }

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
