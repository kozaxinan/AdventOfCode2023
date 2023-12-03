fun main() {
    fun part1(input: List<String>): Int {
        return input
            .map { line ->
                var first = 0
                var second = 0
                line.onEach {
                    if (it.isDigit()) {
                        if (first == 0) {
                            first = it.digitToInt()
                            second = first
                        }
                        if (first != 0) second = it.digitToInt()
                    }
                }
                first * 10 + second
            }
            .sum()
    }

    fun part2(input: List<String>): Int {
        return inputString
            .map { it.replace("nine", "n9e") }
            .map { it.replace("eight", "e8t") }
            .map { it.replace("seven", "7n") }
            .map { it.replace("six", "6") }
            .map { it.replace("five", "5e") }
            .map { it.replace("four", "4") }
            .map { it.replace("three", "t3e") }
            .map { it.replace("two", "t2o") }
            .map { it.replace("one", "o1e") }
            .map { it.replace("zero", "0o") }
            .map { line ->

                var first = 0
                var second = 0
                line.onEach {
                    if (it.isDigit()) {
                        if (first == 0) {
                            first = it.digitToInt()
                            second = first
                        }
                        if (first != 0) second = it.digitToInt()
                    }
                }
                val i = first * 10 + second

                println("$line $i")
                i
            }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 1)

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
