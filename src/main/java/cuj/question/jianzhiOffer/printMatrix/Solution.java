package cuj.question.jianzhiOffer.printMatrix;

import java.util.ArrayList;

/**
 * Created by cujamin on 2017/9/4.
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Solution {
    public static void main(String[]args)
    {
        int[][] matrix = {{1,2},{3,4},{5,6}};
        ArrayList<Integer> al= printMatrix(matrix);
        for(Integer num:al)
        {
            System.out.println(num);
        }
    }
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int sizeX = matrix[0].length;
        int sizeY = matrix.length;

        int layer = 0;
        int dir = 0;//0向右；1向下，2向左，3向上
        int count = sizeX*sizeY;
        int limit = sizeX-1;

        int x=0;
        int y=0;
        while(count>=1)
        {
            int target = matrix[y][x];
            result.add(target);
            --count;
            switch (dir)
            {
                case 0:
                    if(x>=limit)
                    {
                        limit = sizeY-1-layer;
                        dir=(dir+1)%4;
                        ++y;
                    }
                    else
                    {
                        ++x;
                    }

                    break;
                case 1:
                    if(y>=limit)
                    {
                        limit = layer;
                        dir=(dir+1)%4;
                        --x;
                    }
                    else
                    {
                        ++y;
                    }
                    break;
                case 2:
                    if(x<=limit)
                    {
                        layer++;
                        limit = layer;
                        dir=(dir+1)%4;
                        --y;
                    }
                    else
                    {
                        --x;
                    }
                    break;
                case 3:
                    if(y<=limit)
                    {
                        limit = sizeX-1-layer;
                        dir=(dir+1)%4;
                        ++x;
                    }
                    else
                    {
                        --y;
                    }
                    break;
            }
        }
        return result;
    }
}
