class RemoveElementSolution {
    fun removeElementOld(nums: IntArray, `val`: Int): Int {

        if (nums.isEmpty()) return 0

        var i = nums.size-1
        var j = 0

        while (j < nums.size && i !=j){
            if (nums[j] == `val`){
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                i--
            }
            j++
        }
        return j
    }

    fun removeElement(nums: IntArray, `val`: Int): Int {

        if (nums.isEmpty()) return 0
        var k = 0

        for (i in nums.indices){
            if (nums[i] != `val`){
                nums[k] = nums[i]
                k++
            }
        }
        return k
    }
}