package leetcode.editor.cn;

//给你一个以行程长度编码压缩的整数列表 nums 。 
//
// 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后子列表中
//有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。 
//
// 请你返回解压后的列表。 
//
// 
//
// 示例： 
//
// 输入：nums = [1,2,3,4]
//输出：[2,4,4,4]
//解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
//第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
//最后将它们串联到一起 [2] + [4,4,4] = [2,4,4,4]。 
//
// 示例 2： 
//
// 输入：nums = [1,1,2,3]
//输出：[1,3,3]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 100 
// nums.length % 2 == 0 
// 1 <= nums[i] <= 100 
// 
// Related Topics 数组 
// 👍 38 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 解压缩编码列表{
	public static void main(String[] args) {
		Solution solution = new 解压缩编码列表().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] decompressRLElist(int[] nums) {
		int newLength = 0;
		for (int i = 0; i < nums.length; i+=2) {
			newLength+=nums[i];
		}
		int arr[] = new int[newLength];
		int index = 0;
 		for (int i = 0; i < nums.length; i+=2) {
			int count = nums[i];
			while (count > 0) {
				arr[index] = nums[i+1];
				index++;
				count--;
			}
		}

		return arr;
//		执行耗时:1 ms,击败了98.91% 的Java用户
//		内存消耗:39.3 MB,击败了63.86% 的Java用户



//		List<Integer> list = new ArrayList<>();
//		for (int i = 0; i < nums.length; i+=2) {
////			i 个数
////			i+1 内容
//			newLength
//			for (int count = 0; count < nums[i]; count++) {
//				list.add(nums[i+1]);
//			}
//		}
////		Integer arr[] = (Integer[])list.toArray(new Integer[list.size()]);
////		int[] a = arr;
//		int[] arr = new int[list.size()];
// 		for (int i = 0; i < list.size(); i++) {
//			arr[i] = list.get(i);
//		}
//
//		return arr;
//		执行耗时:8 ms,击败了13.68% 的Java用户
//		内存消耗:39.2 MB,击败了71.94% 的Java用户
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
