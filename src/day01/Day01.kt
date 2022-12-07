package day01

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        var maxCal = 0
        var sum = 0
        input.forEach { calorie ->
            if (calorie != "") {
                sum += calorie.toInt()
            } else {
                if (maxCal < sum) {
                    maxCal = sum
                }
                sum = 0
            }
        }
        return maxCal
    }

    fun part2(input: List<String>): Int {
        var sum = 0
        val sumOfCals = ArrayList<Int>()
        input.forEach { calorie ->
            if (calorie != "") {
                sum += calorie.toInt()
            } else {
                sumOfCals.add(sum)
                sum = 0
            }
        }
        return sumOfCals.sorted().reversed().subList(0, 3).sum()
    }

    val input1 = readInput("Day01_1")
    val input2 = readInput("Day01_2")
    println(part1(input1))
    println(part2(input2))
}
