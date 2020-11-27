package leetcode.editor.cn;

//给定两个二叉树，编写一个函数来检验它们是否相同。 
//
// 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。 
//
// 示例 1: 
//
// 输入:       1         1
//          / \       / \
//         2   3     2   3
//
//        [1,2,3],   [1,2,3]
//
//输出: true 
//
// 示例 2: 
//
// 输入:      1          1
//          /           \
//         2             2
//
//        [1,2],     [1,null,2]
//
//输出: false
// 
//
// 示例 3: 
//
// 输入:       1         1
//          / \       / \
//         2   1     1   2
//
//        [1,2,1],   [1,1,2]
//
//输出: false
// 
// Related Topics 树 深度优先搜索 
// 👍 503 👎 0

import javax.swing.tree.TreeNode;

public class 相同的树{
	public static void main(String[] args) {
		Solution solution = new 相同的树().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) { // 节点都为null,返回true
			return true;
		} else if (p == null || q == null) { //只有一个节点为null时,返回false
			return false;
		} else if (p.val != q.val) { // 当两个节点的值不相等时返回false
			return false;
		} else {
//			进行递归
			return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
