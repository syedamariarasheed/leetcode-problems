/* https://leetcode.com/problems/running-sum-of-1d-array/description/ */

fun main(args: Array<String>) {
    val numbers = intArrayOf(1,2,3,4)
    println(runningSum(numbers).toList().toString())
}

fun runningSum(nums: IntArray): IntArray {
    for (index in nums.indices) {
        if (index != 0) {
            nums[index] = nums[index] + nums[index - 1]
        }
    }
    return nums
}