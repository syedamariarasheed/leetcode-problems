/* https://leetcode.com/problems/isomorphic-strings/?envType=study-plan&id=level-1 */
fun main(args: Array<String>) {

    println(longestPalindrome("abccccdd").toString())
    println(longestPalindrome("ababababa").toString())
    println(longestPalindrome("ccc").toString())
}

fun longestPalindrome(s: String): Int {
    val set = s.toSortedSet()
    val list = s.toCharArray()
    val map = HashMap<Char, Int>()

    set.forEach { char ->
        map[char] = list.count { char == it }
    }

    var count = 0

    map.keys.forEach {
        var temp = map[it]
        while (temp != 0) {
            if (temp!! % 2 == 0) {
                count += temp
                break
            } else {
                temp -= 1
            }
        }
    }

    if (map.containsValue(1)) {
        count += 1
    } else if (map.keys.size == 1 && map.values.first() % 2 != 0) {
        count += 1
    } else if (count % 2 == 0 && list.size > count) {
        count += 1
    }


    return count
}
