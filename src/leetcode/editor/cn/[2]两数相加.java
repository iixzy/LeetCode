package leetcode.editor.cn;

//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
// Related Topics 递归 链表 数学 
// 👍 6151 👎 0


import java.util.*;
public class 两数相加 {
    public static void main(String[] args) {
        Solution solution = new 两数相加().new Solution();
        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class ListNode {
    int val;
    ListNode next;
    public ListNode(int x){
        val = x;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1,
                q = l2,
                curr = dummyHead; //指向同一个对象
        int carry = 0; //进位
        while(p != null || q != null) {
            int x = (p != null)? p.val: 0;
            int y = (q != null)? q.val: 0;
            int sum = x+ y+ carry; //加上上一次的进位值获取当前和
            carry = sum/10; //获取下一次的进位值
            curr.next = new ListNode(sum%10); //获取和的个位数字
            curr = curr.next; //指针移到下一位
            if(p!=null) p=p.next;
            if(q!=null) q=q.next;
        }
        if(carry>0){
            curr.next=new ListNode(carry);
        }

        return dummyHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}