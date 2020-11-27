package leetcode.editor.cn;

//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 链表 
// 👍 72 👎 0

import java.util.ArrayList;
import java.util.List;

public class 从尾到头打印链表{
	public static void main(String[] args) {
		Solution solution = new 从尾到头打印链表().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
		ListNode node = head;
		int count = 0;
		while (node != null) {
			node = node.next;
			count++;
		}
		int[] arr = new int[count];
		node = head;
		while (node != null) {
			arr[--count] = node.val;
			node = node.next;
		}
		return arr;
//		List<Integer> list = new ArrayList<>();
//		while (head != null) {
//			list.add(0,head.val);
//			head = head.next;
//		}
//		int[] arr = new int[list.size()];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = list.get(i);
//		}
//		return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
