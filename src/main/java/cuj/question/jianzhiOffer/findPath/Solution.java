package cuj.question.jianzhiOffer.findPath;

import java.util.ArrayList;

/**
 * Created by cujamin on 2017/9/5.
 *
 * 输入一颗二叉树和一个整数，
 * 打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}

public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root.val>target)return result;
        TreeNode temp = root;
        while(null!=temp.left||null!=temp.right)
        {

            if(temp.val<target)
            {

            }
            else if(temp.val==target)
            {

            }
            else
            {
                continue;
            }
        }

        return result;
    }
}
