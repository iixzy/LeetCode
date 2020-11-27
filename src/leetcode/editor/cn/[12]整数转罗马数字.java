package leetcode.editor.cn;

//罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。 
//
// 字符          数值
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000 
//
// 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做 XXVII, 即为 XX + V + I
//I 。 
//
// 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5
// 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况： 
//
// 
// I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。 
// X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
// C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。 
// 
//
// 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。 
//
// 示例 1: 
//
// 输入: 3
//输出: "III" 
//
// 示例 2: 
//
// 输入: 4
//输出: "IV" 
//
// 示例 3: 
//
// 输入: 9
//输出: "IX" 
//
// 示例 4: 
//
// 输入: 58
//输出: "LVIII"
//解释: L = 50, V = 5, III = 3.
// 
//
// 示例 5: 
//
// 输入: 1994
//输出: "MCMXCIV"
//解释: M = 1000, CM = 900, XC = 90, IV = 4. 
// Related Topics 数学 字符串 
// 👍 453 👎 0

public class 整数转罗马数字{
	public static void main(String[] args) {
		Solution solution = new 整数转罗马数字().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public String intToRoman(int num) {
		int a = num%10;
		num/=10;
		int b =num%10;
		num/=10;
		int c =num%10;
		num/=10;
		int d = num%10;
		return num4(d)+num3(c)+num2(b)+num1(a);

	}
	private String num4(int n){
		String res = "";
		switch(n){
			case 1:res="M";break;
			case 2:res="MM";break;
			case 3:res="MMM";break;
			case 0:res="";break;
		}
		return res;
	}
	private String num3(int n){
		String res = "";
		switch(n){
			case 1:res="C";break;
			case 2:res="CC";break;
			case 3:res="CCC";break;
			case 4:res="CD";break;
			case 5:res="D";break;
			case 6:res="DC";break;
			case 7:res="DCC";break;
			case 8:res="DCCC";break;
			case 9:res="CM";break;
			case 0:res="";break;
		}
		return res;
	}
	private String num2(int n){
		String res = "";
		switch(n){
			case 1:res="X";break;
			case 2:res="XX";break;
			case 3:res="XXX";break;
			case 4:res="XL";break;
			case 5:res="L";break;
			case 6:res="LX";break;
			case 7:res="LXX";break;
			case 8:res="LXXX";break;
			case 9:res="XC";break;
			case 0:res="";break;
		}
		return res;
	}
	private String num1(int n){
		String res = "";
		switch(n){
			case 1:res="I";break;
			case 2:res="II";break;
			case 3:res="III";break;
			case 4:res="IV";break;
			case 5:res="V";break;
			case 6:res="VI";break;
			case 7:res="VII";break;
			case 8:res="VIII";break;
			case 9:res="IX";break;
			case 0:res="";break;
		}
		return res;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
