class SearchInsertPositionSolution {

    fun searchInsert(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        while (start <= end) {
            val mid = start + (end - start) / 2
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] < target) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        return start
    }

    fun searchInsertRW(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size-1

        while (start < end){
            val mid = start + (end - start)/2
            if (nums[mid] == target){
                return mid
            }else if (nums[mid] > target){
                end = mid - 1
            }else {
                start = mid + 1
            }
        }
        return -1
    }

    fun searchInsertR(nums: IntArray, target: Int): Int {
        return split(nums, target, 0, nums.size - 1)
    }

    private fun split(nums: IntArray, target: Int, start: Int, end: Int): Int {
        if (start > end) {
            return start
        }
        val mid = start + (end - start) / 2
        return if (nums[mid] == target) {
            mid
        } else if (nums[mid] > target) {
            split(nums, target, start, mid - 1)
        } else {
            split(nums, target, mid + 1, end)
        }
    }
}