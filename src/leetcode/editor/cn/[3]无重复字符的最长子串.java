package leetcode.editor.cn;

//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 示例 4: 
//
// 
//输入: s = ""
//输出: 0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 104 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 4634 👎 0

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 无重复字符的最长子串{
	public static void main(String[] args) {
		Solution solution = new 无重复字符的最长子串().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {

//		暴力法
//    	int n = s.length();
//		int max = 0;
//		Set<Character> set = new HashSet<>();
//		for (int i = 0; i < n; i++) {
//			int count = 0;
//			for (int j = i; j < n; j++) {
//				if (set.add(s.charAt(j))) {//有一个不相同,次数就加一
//					count++;
//					max = Math.max(max, count);//置换最大值
//				} else {
//					set.clear();
//					break;
//				}
//			}
//		}
//		return max;


		/**
		 * 以这个字符串为例：abcabcbb，当i等于3时，也就是指向了第二个a, 此时我就需要查之前有没有出现过a,
		 * 如果出现了是在哪一个位置出现的。然后通过last[index] 查到等于1, 也就是说，如果start 依然等于0的话，
		 * 那么当前窗口就有两个a了，也就是字符串重复了，所以我们需要移动当前窗口的start指针，移动到什么地方呢？
		 * 移动到什么地方，窗口内就没有重复元素了呢？ 对了，就是a上一次出现的位置的下一个位置，就是1 + 1 = 2。
		 * 当start == 2, 当前窗口就没有了重复元素，那么以当前字符为结尾的最长无重复子串就是bca,然后再和之前的res取最大值。
		 * 然后i指向后面的位置，按照同样思路计算。
		 */
		// 记录字符上一次出现的位置
//		int[] last = new int[128]; // 为什么是128?因为ASCII码有128个
//		for(int i = 0; i < 128; i++) {
//			last[i] = -1;
//		}
//		int n = s.length();
//
//		int res = 0;
//		int start = 0; // 窗口开始位置
//		for(int i = 0; i < n; i++) {
//			int index = s.charAt(i);//字符转成数字 ASCII表中的数字
//			start = Math.max(start, last[index] + 1);
//			res   = Math.max(res, i - start + 1);
//			last[index] = i;
//		}
//
//		return res;

		/*
		* 第二个a start = Math.max(start, last[index] + 1) = Math.max(0, 0 + 1) = 1
		* i = 3  res   = Math.max(res, i - start + 1) = Math.max(1, 3 - 1 + 1) = 3*/

		// 哈希集合，记录每个字符是否出现过
		Set<Character> occ = new HashSet<>();
		int n = s.length();
		// 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
		int rk = -1, ans = 0;
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				// 左指针向右移动一格，移除一个字符
				occ.remove(s.charAt(i - 1));
			}
			while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
				// 不断地移动右指针
				occ.add(s.charAt(rk + 1));
				++rk;
			}
			// 第 i 到 rk 个字符是一个极长的无重复字符子串
			ans = Math.max(ans, rk - i + 1);
		}

		return ans;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
