/* https://leetcode.com/problems/isomorphic-strings/?envType=study-plan&id=level-1 */
fun main(args: Array<String>) {
    println(isIsomorphic("egg", "add"))
    println(isIsomorphic("bbbaaaba", "aaabbbba"))
    println(isIsomorphic("badc", "baba"))
}

/* one-to-one mapping
  abb <-> tee -> true
* bbbaaaba <-> aaabbbba -> false
* */
fun isIsomorphic(s: String, t: String): Boolean {
    val first = s.toCharArray()
    val second = t.toCharArray()

    val patternS = ArrayList<Int>()
    val patternT = ArrayList<Int>()

    for (i in first.indices) {
        if (i == 0) {
            patternS.add(1)
        } else if (first[i - 1] != first[i] && !first.slice(IntRange(0,i-1)).contains(first[i])) {
            patternS.add(1)
        } else if (first.slice(IntRange(0,i-1)).contains(first[i])) {
            patternS[patternS.lastIndex] = patternS[patternS.lastIndex]++
        }
    }

    for (i in second.indices) {
        if (i == 0) {
            patternT.add(1)
        } else if (second[i - 1] != second[i] && !second.slice(IntRange(0,i-1)).contains(second[i])) {
            patternT.add(1)
        } else if (second.slice(IntRange(0,i-1)).contains(second[i])) {
            patternT[patternT.lastIndex] = patternT[patternT.lastIndex]++
        }
    }
    return patternS.toList() == patternT.toList()
}
