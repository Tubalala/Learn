package cn.leetCode.t100d.t150d;

import cn.function.domain.ListNode;
import cn.function.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*给定一个二叉树，返回它的 前序 遍历。

 示例:

输入: [1,null,2,3]
   1
    \
     2
    /
   3

输出: [1,2,3]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/binary-tree-preorder-traversal
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        dfs(root,list);
        return list;
    }
    public void dfs(TreeNode root , List<Integer> list) {
        if (root != null) {
            list.add(root.val);
        }
        if (root.left != null) {
            dfs(root.left,list);
        }
        if (root.right != null) {
            dfs(root.right,list);
        }
    }
}
