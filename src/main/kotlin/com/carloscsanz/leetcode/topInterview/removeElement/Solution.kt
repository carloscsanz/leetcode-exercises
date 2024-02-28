package com.carloscsanz.leetcode.topInterview.removeElement

/**
 * Top Interview 150
 *
 * 27. Remove Element
 */
object Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var frontIndex = 0
        var backIndex = nums.size - 1
        var count = 0

        while (frontIndex <= backIndex) {
            if (nums[frontIndex] == `val`) {
                if (nums[backIndex] == `val`) {
                    backIndex--
                    count++
                } else {
                    nums[frontIndex++] = nums[backIndex]
                    nums[backIndex--] = `val`
                    count++
                }
            } else {
                frontIndex++
                if (nums[backIndex] == `val`) {
                    backIndex--
                    count++
                }
            }
        }

        return nums.size - count
    }
}
