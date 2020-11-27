package leetcode.editor.cn;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9582 👎 0

import java.util.HashMap;
import java.util.Map;

public class 两数之和{
	public static void main(String[] args) {
		Solution solution = new 两数之和().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int[] arr = new int[2];
//    	第一个数为target-nums[i],第二个数为nums[i]
		Map<Integer,Integer> map = new HashMap<>();// 存放数值
		Map<Integer,Integer> map2 = new HashMap<>();// 存放数值对应的下标
		int n = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				arr[0] = map2.get(nums[i]);
				arr[1] = i;
				break;
			} else {
				map.put(target-nums[i],nums[i]);
				map2.put(target-nums[i],i);
			}
		}
		return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
