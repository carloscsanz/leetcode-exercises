package com.carloscsanz.leetcode.topInterview.mergeSortedArray

/**
 * Top Interview 150
 *
 * 88. Merge Sorted Array
 */
object Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var mIndex = m - 1
        var nIndex = n - 1
        var resultIndex = m + n - 1

        while (resultIndex >= 0 && nIndex >= 0) {
            if (mIndex >= 0 && nums1[mIndex] >= nums2[nIndex]) {
                nums1[resultIndex--] = nums1[mIndex--]
            } else {
                nums1[resultIndex--] = nums2[nIndex--]
            }
        }
    }
}
