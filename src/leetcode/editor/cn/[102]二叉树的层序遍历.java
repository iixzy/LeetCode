package leetcode.editor.cn;

//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例： 
//二叉树：[3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索 
// 👍 687 👎 0

import sun.reflect.generics.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.*;

public class 二叉树的层序遍历{
	public static void main(String[] args) {
		Solution solution = new 二叉树的层序遍历().new Solution();
		
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
    public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null)return res;
		Queue<TreeNode> que = new LinkedList<>();
		que.offer(root);
		while (!que.isEmpty()) {
			List<Integer> level = new ArrayList<>();
			int currentLevelSize = que.size();
			for (int i = 1; i <= currentLevelSize; i++) {
				TreeNode node = que.poll();
				level.add(node.val);
				if (node.left != null) {
					que.offer(node.left);
				}
				if (node.right != null) {
					que.offer(node.right);
				}
			}
			res.add(level);
		}
		return res;
//		Deque 栈
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
