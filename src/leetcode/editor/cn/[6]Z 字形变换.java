package leetcode.editor.cn;

//将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。 
//
// 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下： 
//
// L   C   I   R
//E T O E S I I G
//E   D   H   N
// 
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。 
//
// 请你实现这个将字符串进行指定行数变换的函数： 
//
// string convert(string s, int numRows); 
//
// 示例 1: 
//
// 输入: s = "LEETCODEISHIRING", numRows = 3
//输出: "LCIRETOESIIGEDHN"
// 
//
// 示例 2: 
//
// 输入: s = "LEETCODEISHIRING", numRows = 4
//输出: "LDREOEIIECIHNTSG"
//解释:
//
//L     D     R
//E   O E   I I
//E C   I H   N
//T     S     G 
// Related Topics 字符串 
// 👍 917 👎 0

public class Z 字形变换{
	public static void main(String[] args) {
		Solution solution = new Z 字形变换().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convert(String s, int numRows) {
		if (numRows == 1 || numRows >= s.length()) {
			return s;
		}
		char[] chars = new char[s.length()];
		int colLen = 2 * numRows - 2;  //每列的长度
		if(colLen==0) colLen=1;
		int n = s.length();
		int index;
		int minCol = n / colLen;   //共有多少完整列
		int ci = 0;
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < minCol + 1; j++) {
				index = j * colLen + i;
				if (index < s.length()) {
					chars[ci++] = s.charAt(index);
				}
				if (i != 0 && i != numRows - 1) {
					index = j * colLen + i + 2 * (numRows - i - 1);
					if (index < s.length())
						chars[ci++] = s.charAt(index);
				}
			}
		}
		return String.valueOf(chars);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
