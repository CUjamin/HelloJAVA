package cuj.question.jianzhiOffer.printFromTopToBottom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cujamin on 2017/9/5.
 *
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(null!=root)
        {
            List<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);
            TreeNode temp = null;
            while(!queue.isEmpty())
            {
                temp=queue.remove(0);
                result.add(temp.val);
                if(null!=temp.left)queue.add(temp.left);
                if(null!=temp.right)queue.add(temp.right);
            }
        }
        return  result;
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