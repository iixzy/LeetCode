package leetcode.editor.cn;

//在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [3,4,3,3]
//输出：4
// 
//
// 示例 2： 
//
// 输入：nums = [9,1,7,9,7,9,7]
//输出：1 
//
// 
//
// 限制： 
//
// 
// 1 <= nums.length <= 10000 
// 1 <= nums[i] < 2^31 
// 
//
// 
// 👍 104 👎 0

import java.util.HashMap;
import java.util.Map;

public class 数组中数字出现的次数 II{
	public static void main(String[] args) {
		Solution solution = new 数组中数字出现的次数 II().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
		int a = 0;
		int b = 0;

		for(int num : nums) {
			a = (a ^ num) & ~b;
			b = (b ^ num) & ~a;
		}

		return a;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
