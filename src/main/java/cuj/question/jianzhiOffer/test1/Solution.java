package cuj.question.jianzhiOffer.test1;

/**
 * Created by cujamin on 2017/5/24.
 * 在一个二维数组中，
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 */
public class Solution {

    public boolean Find ( int target, int[][] array) {
        if(array.length==0)return false;
        if(array[0].length==0)return false;
        int i = 0;
        int j = 0;

        for (; i < array[0].length; ++i) {
            if (target <= array[0][i]) {
                if(array[0][i] == target)return true;
                break;
            }
        }
        for (; j < array.length; ++j) {
            if ( target <= array[j][0] ) {
                if(array[j][0] == target)return true;
                break;
            }
        }

        if(i==0&&j==0)return false;

        return FindInField(target,array,i,j);
    }
    public boolean FindInField(int target, int[][] array , int i , int j) {
        for(int n=j-1;n>=0;--n)
        {
            for(int m=i-1;m>=0;--m)
            {
                if(array[n][m]==target)return true;
            }
        }

        return false;
    }
}
