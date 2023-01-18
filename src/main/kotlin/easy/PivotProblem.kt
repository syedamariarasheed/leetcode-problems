/* https://leetcode.com/problems/find-pivot-index/description/ */
fun main(args: Array<String>) {

    val inputFirst = intArrayOf(1, 7, 3, 6, 5, 6)
    val inputTwo = intArrayOf(1, 2, 3)
    val inputThree = intArrayOf(2, 1, -1)
    val inputFour = intArrayOf(-1, -1, 0, 1, 1, 0)

    println(pivotIndex(inputFirst).toString())
    println(pivotIndex(inputTwo).toString())
    println(pivotIndex(inputThree).toString())
    println(pivotIndex(inputFour).toString())
}

fun pivotIndex(nums: IntArray): Int {
    for (pivot in nums.indices) {
        var leftSum = 0
        var rightSum = 0

        val inclusiveIndex = if (pivot + 1 > nums.lastIndex) {
            nums.lastIndex
        } else {
            pivot + 1
        }

        if (pivot != nums.lastIndex) {
            rightSum = nums.slice(IntRange(inclusiveIndex, nums.lastIndex)).sum()
        }
        if (pivot != 0) {
            leftSum = nums.slice(IntRange(0, pivot - 1)).sum()
        }
        if (rightSum == leftSum) {
            return pivot
        }
    }
    return -1
}