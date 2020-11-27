package leetcode.editor.cn;

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串 
// 👍 1968 👎 0

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class 有效的括号{
	public static void main(String[] args) {
		Solution solution = new 有效的括号().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
		int n = s.length();
		if (n % 2 == 1) {
			return false;
		}
//		新的map生成方式
		Map<Character, Character> pairs = new HashMap<Character, Character>() {{
			put(')', '(');
			put(']', '[');
			put('}', '{');
		}};
//		生成栈 -- 先进后出
		Deque<Character> stack = new LinkedList<Character>();
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (pairs.containsKey(ch)) { // 为true时是结尾符 false是起始符
				if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
					return false;
				}
				stack.pop();
			} else {
				stack.push(ch);
			}
		}

		return stack.isEmpty();






////	方法2 太慢~
//    	if (s.length()%2 != 0)return false;
//    	int n = s.length()/2;
//		for (int index = 0; index < n; index++) {
//			if (s.contains("{}")) {
//				s = s.replace("{}","");
//			}
//			if (s.contains("[]")) {
//				s = s.replace("[]","");
//			}
//			if (s.contains("()")) {
//				s = s.replace("()","");
//			}
//			if (s.length() == 0) {
//				return true;
//			}
//		}
//		return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
