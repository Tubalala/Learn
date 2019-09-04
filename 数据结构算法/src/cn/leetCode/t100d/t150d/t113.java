package cn.leetCode.t100d.t150d;

import cn.function.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class t113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<Integer> list = new ArrayList<>();
        int r = 0;
        dfs(root,res,list,sum,r);
        return res;
    }
    public void dfs(TreeNode root ,List<List<Integer>> res , List<Integer> list,int sum, int r){
        if (root != null) {
            r += root.val;
            list.add(root.val);
        }
        if (root.left == null && root.right == null) {
            if (r == sum) {
                res.add(new ArrayList<>(list));
            }
        }
        if (root.left != null) {
            dfs(root.left,res,list,sum,r);
        }
        if (root.right != null) {
            dfs(root.right,res,list,sum,r);
        }
        list.remove(list.size()-1);
    }
}
