package cuj.question.jianzhiOffer.verifySquenceOfBST;

/**
 * Created by cujamin on 2017/9/5.
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 */
public class Solution {
    public static void main(String[]args)
    {
        int[] trees = {};
        System.out.println(VerifySquenceOfBST(trees));
    }
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if(null==sequence||0==sequence.length)return false;
        return isSquenceOfBST(sequence,0,sequence.length-2,sequence.length-1);
    }
    public static boolean isSquenceOfBST(int[]sqence,int start,int end,int root)
    {
        boolean result = true;
        if(root-start<=0)return result;
        else if(root-start<=1)return result;
        else
        {
            int middle= start;
            while(middle<end)
            {
                if(sqence[middle]<sqence[root])++middle;
                else break;
            }
            int j = middle;
            while(j<end)
            {
                if(sqence[j]<sqence[root])return false;
                ++j;
            }
            int i = middle;
            int startL= start;
            int endL = middle-1;
            int startR = middle;
            int endR = end;
            endL=startR-1;
            if(middle>=root)
                return isSquenceOfBST(sqence,startL,endL-1,endL);
            else if(middle<=start)
                return isSquenceOfBST(sqence,startR,endR-1,endR);
            else
            {
                result = isSquenceOfBST(sqence,startL,endL-1,endL)&&isSquenceOfBST(sqence,startR,endR-1,endR);
            }
        }
        return result;
    }
}
