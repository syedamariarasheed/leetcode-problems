/* https://leetcode.com/problems/isomorphic-strings/?envType=study-plan&id=level-1 */
fun main(args: Array<String>) {
//    println(isIsomorphic("egg", "add"))
//    println(isIsomorphic("bbbaaaba", "aaabbbba"))
    println(isIsomorphic("badc", "baba"))
}

/* one-to-one mapping
  abb <-> tee -> true
* bbbaaaba <-> aaabbbba -> false
* */
//: Todo: Refactoring
fun isIsomorphic(s: String, t: String): Boolean {

    val mapping = HashMap<Char, Char>()
    val mappedBefore = HashMap<Char, Boolean>()
    var equivalent = true


    for (i in 0 until s.toCharArray().size) {
        if (mapping.containsKey(s.toCharArray()[i])) {
            val mapped: Char? = mapping[s.toCharArray()[i]]
            if (mapped != t.toCharArray()[i]) {
                equivalent = false
                break
            }
        } else {
            if (mappedBefore.containsKey(t.toCharArray()[i])) {
                equivalent = false
                break
            } else {
                mappedBefore[t.toCharArray()[i]] = true
                mapping[s.toCharArray()[i]] = t.toCharArray()[i]
            }
        }
    }
    return equivalent
}
