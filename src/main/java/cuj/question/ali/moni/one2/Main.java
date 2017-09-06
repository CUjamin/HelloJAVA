package cuj.question.ali.moni.one2;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/7/29.
 */
public class Main {
    public static void main(String[]args)
    {
        int result = 0;
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[][] casts = new int[n+1][5];
        int[] one = {0,0,0,0,0};
        casts[0] = one;
        for(int i=1;i<=n;++i)
        {
            String temp = input.nextLine();
            String[] templocal = temp.split(" ");
            for(int j=0;j<5;++j)
            {
                if(j<3)
                {
                    casts[i][j]=Integer.parseInt(templocal[j]);
                }
                else if(j<4)
                {
                    casts[i][j]=10*Integer.parseInt(templocal[j]);
                }
                else
                {
                    casts[i][j]=100*Integer.parseInt(templocal[j]);
                }
            }
        }

        for(int i=1;i<=n;++i)
        {
            result += getCast(casts[i],casts[i-1]);
        }
        result+=getCast(casts[n],casts[0]);
        System.out.println(result);
    }
    public static int getCast(int[] from , int[] to)
    {
        int result = 0;
        int length = from.length;
        for(int i= 0;i<length;++i)
        {
            int temp = to[i]-from[i];
            if(temp>0)result += temp;
            else result +=(-temp);
        }
        return result;
    }
}
