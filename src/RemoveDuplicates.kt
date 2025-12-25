class RemoveDuplicatesSolution {
    fun removeDuplicatesOld(nums: IntArray): Int {
        val result = mutableSetOf<Int>()
        nums.forEach {
            result.add(it)
        }
        return result.size
    }

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var i = 0

        for (j in 1..<nums.size){
            if (nums[j] != nums[i]){
                i++
                nums[i] = nums[j]
            }
        }
        return i + 1
    }
}