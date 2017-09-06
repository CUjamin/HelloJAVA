package cuj.question.jianzhiOffer.hassubtree;

import java.util.LinkedList;

/**
 * Created by cujamin on 2017/9/4.
 *
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution {

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if(null!=root1&&null!=root2)
        {
            if(root1.val==root2.val)
                result = doesTree1hasTree2(root1,root2);
            if(!result)
                result = HasSubtree(root1.left,root2);
            if(!result)
                result = HasSubtree(root1.right,root2);
        }
        return result;
    }
    public boolean doesTree1hasTree2(TreeNode root1,TreeNode root2)
    {
        if(root2==null)return true;
        if(root1==null)return false;
        if(root1.val!=root2.val)return false;
        return doesTree1hasTree2(root1.left,root2.left)&&doesTree1hasTree2(root1.right,root2.right);
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
