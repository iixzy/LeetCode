package leetcode.editor.cn;

//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。 
//
// 示例 1： 
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
// 
//
// 示例 2： 
//
// 输入: "cbbd"
//输出: "bb"
// 
// Related Topics 字符串 动态规划 
// 👍 2931 👎 0

public class 最长回文子串{
	public static void main(String[] args) {
		Solution solution = new 最长回文子串().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public String longestPalindrome(String s) {
////		如果字符串为空返回空
//		if (s == null || s.length() == 0) {
//			return "";
//		}
////         保存起始位置，测试了用数组似乎能比全局变量稍快一点
//		int[] range = new int[2];
////		将字符串变成字符数组
//		char[] str = s.toCharArray();
//		for (int i = 0; i < s.length(); i++) {
////             把回文看成中间的部分全是同一字符，左右部分相对称
////             找到下一个与当前字符不同的字符
//			i = findLongest(str, i, range);
//		}
//		return s.substring(range[0], range[1] + 1);


//		动态规划
			int n = s.length();
			boolean[][] dp = new boolean[n][n];
			String ans = "";
			for (int l = 0; l < n; ++l) {
				for (int i = 0; i + l < n; ++i) {
					int j = i + l;
					if (l == 0) {
						dp[i][j] = true;
					} else if (l == 1) {
						dp[i][j] = (s.charAt(i) == s.charAt(j));
					} else {
						dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
					}
					if (dp[i][j] && l + 1 > ans.length()) {
						ans = s.substring(i, i + l + 1);
					}
				}
			}
			return ans;
	}

	public static int findLongest(char[] str, int low, int[] range) {
//         查找中间部分
		int high = low;
		while (high < str.length - 1 && str[high + 1] == str[low]) {
			high++;
		}
//         定位中间部分的最后一个字符
		int ans = high;
//         从中间向左右扩散
		while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
			low--;
			high++;
		}
//         记录最大长度
		if (high - low > range[1] - range[0]) {
			range[0] = low;
			range[1] = high;
		}
		return ans;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
