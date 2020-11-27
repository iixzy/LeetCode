package leetcode.editor.cn;

//给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。 
//
// 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点
//。 
//
// 示例 1: 
//
// 
//输入: 
//	Tree 1                     Tree 2                  
//          1                         2                             
//         / \                       / \                            
//        3   2                     1   3                        
//       /                           \   \                      
//      5                             4   7                  
//输出: 
//合并后的树:
//	     3
//	    / \
//	   4   5
//	  / \   \ 
//	 5   4   7
// 
//
// 注意: 合并必须从两个树的根节点开始。 
// Related Topics 树 
// 👍 574 👎 0

import javax.swing.tree.TreeNode;
import java.util.HashMap;

public class 合并二叉树{
	public static void main(String[] args) {
		Solution solution = new 合并二叉树().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//		if (t1 == null && t2 == null) {
//			return null;
//		}

		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}
		TreeNode node = t1;
		node.val = t1.val + t2.val;
		node.left = mergeTrees(t1.left,t2.left);
		node.right = mergeTrees(t1.right,t2.right);
		return node;

//		// 先合并根节点
//		TreeNode root = new TreeNode((t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val));
//		// 再递归合并左右子树
//		root.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
//		root.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
//		return root;



//		return mirr(t1,t2);
    }

	private TreeNode mirr(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}
		TreeNode node = t1;
		node.val = t1.val + t2.val;
		node.left = mirr(t1.left,t2.left);
		node.right = mirr(t1.right,t2.right);
		return node;

	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
