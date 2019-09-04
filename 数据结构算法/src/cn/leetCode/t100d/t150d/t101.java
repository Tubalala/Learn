package cn.leetCode.t100d.t150d;
/*给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3
但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/symmetric-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return find(root.left,root.right);
    }
    public static boolean find(TreeNode left, TreeNode right){
        if (left == null && right == null) {
            return true;
        }
        if (left!=null && right!=null &&left.val == right.val) {
            return find(left.left,right.right) && find(left.right,right.left);
        }
        return false;
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
