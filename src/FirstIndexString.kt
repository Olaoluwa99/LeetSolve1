class FirstIndexStringSolution {
    fun strStrLong(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0

        val n = haystack.length
        val m = needle.length

        for (i in 0..n - m) {
            var match = true
            for (j in 0..<m) {
                if (haystack[i + j] != needle[j]) {
                    match = false
                    break
                }
            }
            if (match) {
                return i
            }
        }
        return -1
    }

    fun strStr(haystack: String, needle: String): Int {
        for (i in 0..haystack.length-needle.length){
            if (haystack.substring(i, i+needle.length) == needle){
                return i
            }
        }
        return -1
    }
}