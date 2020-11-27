package leetcode.editor.cn;

//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 817 👎 0

import java.util.ArrayList;
import java.util.List;

public class 移动零{
	public static void main(String[] args) {
		Solution solution = new 移动零().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
//		List<Integer> list = new ArrayList<>();
//		int zeroNum = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] == 0) {
//				zeroNum++;
//			} else {
//				list.add(nums[i]);
//			}
//		}
//		for (int i = 0; i < list.size(); i++) {
//			nums[i] = list.get(i);
//		}
//		while (zeroNum > 0) {
//			zeroNum--;
//			nums[nums.length-1-zeroNum] = 0;
//		}
		
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			}
		}

		while (j < nums.length) {
			nums[j++] = 0;
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
