class LongestCommonPrefixSolution {
    /*fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var prefix = strs[0]

        for (i in 1..<strs.size) {
            // While the current string (strs[i]) does not start with the prefix...
            while (!strs[i].startsWith(prefix)) {
                // ...shorten the prefix by 1 character from the end
                prefix = prefix.substring(0, prefix.length - 1)

                if (prefix.isEmpty()) return ""
            }
        }
        return prefix
    }*/

    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var prefix = strs[0]
        for (i in 1..<strs.size){
            while (!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length-1)
                if (prefix.isEmpty()) return ""
            }
        }
        return prefix
    }
}