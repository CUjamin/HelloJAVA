package cuj.question.jianzhiOffer.mirrortree;

/**
 * Created by cujamin on 2017/9/4.
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 *二叉树的镜像定义：源二叉树
      8
    /   \
   6    10
  / \  / \
 5  7 9 11
 镜像二叉树
      8
    /  \
   10   6
  / \  / \
 11 9 7  5
 */
public class Solution {
    public void Mirror(TreeNode root) {
        if(null==root)return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
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
