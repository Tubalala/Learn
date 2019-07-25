package cn.function.sort;

import cn.function.domain.TreeNode;

/**
 * 二叉树遍历
 */
public class TreeOrder {
    /**
     * 前序遍历
     * @param root
     */
    public void preOrder(TreeNode root){
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * 中序遍历
     * @param root
     */
    public void midOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        midOrder(root.left);
        System.out.println(root.val);
        midOrder(root.right);
    }

    /**
     * 后序遍历
     * @param root
     */
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        TreeOrder to = new TreeOrder();
        to.postOrder(root);
    }
}
