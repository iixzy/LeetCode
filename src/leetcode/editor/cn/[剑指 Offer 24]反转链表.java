package leetcode.editor.cn;

//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。 
//
// 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/ 
// Related Topics 链表 
// 👍 132 👎 0

public class 反转链表{
	public static void main(String[] args) {
		Solution solution = new 反转链表().new Solution();
		
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
    public ListNode reverseList(ListNode head) {
    	ListNode node = head;
    	int i = 0;
		while (node.next != null) {
			node = node.next;
			i++;
		}
		int[] arr = new int[i];
		node = head;
		while (node.next != null) {
			arr[--i] = node.val;
			node = node.next;
		}
//		node = head;
//		for (int in : arr) {
//			node.val = in;
//			node = node.next;
//		}
		return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
