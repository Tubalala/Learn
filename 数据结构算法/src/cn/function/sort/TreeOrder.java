package cn.function.sort;

import cn.function.domain.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

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
     * 前序遍历 无递归
     * @param root
     * @return
     */
    public List<Integer> preOrderByStack(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                ret.add(cur.val);
                cur = cur.left;
            }else {
                cur = stack.pop();
                cur = cur.right;
            }
        }
        return ret;
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
     * 中序遍历 无递归
     * @param root
     * @return
     */

    public List<Integer> midOrderByStack(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                ret.add(cur.val);
                cur = cur.right;
            }
        }
        return ret;
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

    /**
     * 后序遍历 无递归 借助前序遍历 反转 实现
     * @param root
     * @return
     */
    public List<Integer> postOrderBystack(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                ret.add(cur.val);
                cur = cur.right;
            }else {
                cur = stack.pop();
                cur = cur.left;
            }
        }
        Collections.reverse(ret);
        return ret;
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        TreeOrder to = new TreeOrder();
        to.postOrder(root);
    }
}
