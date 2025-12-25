class TwoSumSolution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        /*for ((index, value ) in nums.withIndex()){
            val complement = target - value

            if (map.containsKey(complement)){
                return intArrayOf(map[complement]!!, index)
            }
            map[value] = index
        }*/

        nums.forEachIndexed{index, value ->
            val complement = target - value
            if (map.containsKey(complement)){
                return intArrayOf(map[complement]!!, index)
            }
            map[value] = index
        }

        return intArrayOf()
    }
}

class TwoSumSolution2 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices){
            for (j in i+1..<nums.size){
                if (nums[i] + nums[j] == target) return intArrayOf(i, j)
            }
        }
        return intArrayOf()
    }
}