package leetcode.editor.cn;

//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 你可以假设数组中无重复元素。 
//
// 示例 1: 
//
// 输入: [1,3,5,6], 5
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [1,3,5,6], 2
//输出: 1
// 
//
// 示例 3: 
//
// 输入: [1,3,5,6], 7
//输出: 4
// 
//
// 示例 4: 
//
// 输入: [1,3,5,6], 0
//输出: 0
// 
// Related Topics 数组 二分查找 
// 👍 736 👎 0

import java.util.HashSet;
import java.util.Set;

public class 搜索插入位置{
	public static void main(String[] args) {
		Solution solution = new 搜索插入位置().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
//    	瞎写
//		Set<Integer> set = new HashSet<>();
//		set.add(target);
//		if (nums[0] > target)return 0;
//		if (nums[nums.length-1] < target)return nums.length;
//		for (int i = 0; i < nums.length; i++) {
//			if (!set.add(nums[i]))return i;
//		}
//		for (int i = 0; i < nums.length-1; i++) {
//			if (nums[i] < target && nums[i+1] > target)return i+1;
//		}
//		return 0;

//		二分 细细品
		int n = nums.length;
		int left = 0, right = n - 1, ans = n;
		while (left <= right) {
			int mid = ((right - left) >> 1) + left; // 中位值
			if (target <= nums[mid]) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ans;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
