/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan&id=level-1 */

fun main(args: Array<String>) {
    val numbers = intArrayOf(7, 1, 2, 3, 6, 4)
    val numbersSample2 = intArrayOf(2, 4, 1)
    val numbersSample3 = intArrayOf(1, 2, 1, 0, 1, 2)
    println(maxProfit(numbers).toString())
    println(maxProfit(numbersSample2).toString())
    println(maxProfit(numbersSample3).toString())
}

fun maxProfit(prices: IntArray): Int {
    var diff = 0
    var min = 100000
    for (i in prices.indices) {
        min = min.coerceAtMost(prices[i])

        if (min < prices[i]) {
            if (diff < prices[i] - min) {
                diff = prices[i] - min
            }
        }
    }

    return diff
}