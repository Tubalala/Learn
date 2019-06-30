package cn.leetCode.t100d;

import cn.function.domain.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*给定一个二叉树，返回它的 后序 遍历。

示例:

输入: [1,null,2,3]
   1
    \
     2
    /
   3

输出: [3,2,1]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/binary-tree-postorder-traversal
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        dfs(root,list);
        Collections.reverse(list);
        return list;
    }
    public void dfs(TreeNode root , List<Integer> list) {
        if (root != null) {
            list.add(root.val);
        }
        if (root.right != null) {
            dfs(root.right,list);
        }
        if (root.left != null) {
            dfs(root.left,list);
        }
    }
}
