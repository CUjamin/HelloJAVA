package cuj.question.toutiao.q1;

import com.sun.org.apache.xerces.internal.impl.dv.xs.IntegerDV;
import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/9/10.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String[] str1 = in.nextLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);
        int c = Integer.parseInt(str1[2]);

        int[][] data = new int[n][c+1];
        for(int i=0;i<n;++i)
        {
            String[] colors = in.nextLine().split(" ");
            data[i][0] = Integer.parseInt(colors[0]);
            for(int j=0;j<data[i][0];++j)
            {
                data[i][j] = Integer.parseInt(colors[j]);
            }
        }
        handle(n,m,c,data);
    }
    public static void handle(int n,int m,int c,int[][] data)
    {
        int wrongNum = 0;
        for(int i=0;i<n;++i)
        {
            int[] temp = new int[n];
            for(int j=0;j<data[i][0];++j)
            {
                temp[i] = data[i][j];
            }
            int sameNum = 1;
            boolean fail = false;
            for(int k = 0;k<=n+m-1;++k)
            {
                if(temp[k%n]==temp[(k+1)%n])sameNum++;
                else sameNum=1;
                if(sameNum>=m)
                {
                    fail = true;
                    break;
                }
            }
            if(fail)wrongNum++;

        }
        System.out.println(wrongNum);

    }
}
