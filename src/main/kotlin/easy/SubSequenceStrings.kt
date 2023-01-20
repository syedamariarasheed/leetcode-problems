/* https://leetcode.com/problems/is-subsequence/?envType=study-plan&id=level-1 */
fun main(args: Array<String>) {
    println(isSubsequence("ace", "abcde"))
    println(isSubsequence("ace", "aec"))
    println(isSubsequence("ab", "baab"))
    println(isSubsequence("ab", "baacb"))
}

fun isSubsequence(s: String, t: String): Boolean {
    val sArray = s.toCharArray()
    val tArray = t.toCharArray()
    var newString = ""
    var pointer = 0
    for (i in sArray.indices) {
        for (j in pointer until tArray.size) {
            if (tArray[j] == sArray[i]) {
                newString += tArray[j].toString()
                pointer = j + 1
                break
            }
        }
    }

    return newString == s
}
