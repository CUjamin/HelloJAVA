package cuj.question.jianzhiOffer.test4;

/**
 * Created by cujamin on 2017/5/24.
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}
 * 和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public static void main(String[]args)
    {
        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {4,2,1,5,3,6};

        new Solution().reConstructBinaryTree(pre,in);
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    public TreeNode reConstructBinaryTree(int [] pre,int preStart,int preEnd,int [] in,int inSatrt , int inEnd)
    {
        if(preStart>preEnd||inSatrt>inEnd)return null;
        TreeNode treeNode = new TreeNode(pre[preStart]);

        for(int i=inSatrt;i<=inEnd;++i)
        {
            if(in[i]==pre[preStart])
            {
                treeNode.left = reConstructBinaryTree(pre,preStart+1,preStart+i-inSatrt,in,inSatrt,i-1);
                treeNode.right = reConstructBinaryTree(pre,preStart+i-inSatrt+1,preEnd,in,i+1,inEnd);
            }
        }
        return treeNode;
    }
}


