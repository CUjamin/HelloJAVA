package cuj.question.lianjia.one2;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/19.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String temp_n_r_avg = in.nextLine();
        int n = Integer.parseInt(temp_n_r_avg.split(" ")[0]);
        int r = Integer.parseInt(temp_n_r_avg.split(" ")[1]);
        int avg = Integer.parseInt(temp_n_r_avg.split(" ")[2]);
        int[] a = new int[n];
        int[] b = new int[n];
        int sum = 0;
        for(int i =0;i<n;i++)
        {
            String tempStr = in.nextLine();
            a[i] = Integer.parseInt(tempStr.split(" ")[0]);
            b[i] = Integer.parseInt(tempStr.split(" ")[1]);
            sum+=a[i];
        }
        int[][] score = sort(a,b);
        int resultmagic = 0;


        while(sum/n<avg)
        {
            for(int i=0;i<n;++i)
            {
                if(score[0][i]<r)
                {
                    sum+=score[1][i];
                    resultmagic+=score[1][i];
                    score[0][i]+=1;
                    System.out.println("+"+score[1][i]+" sum:"+sum+" m:"+resultmagic);
                    break;
                }
            }
//            System.out.println(" sum/n:"+sum/n+" m:"+resultmagic);
        }



        System.out.println(resultmagic);

    }
    public static int[][] sort(int[] a,int[] b)
    {
        int[][] result = new int[2][a.length];
        for(int i= 0;i<a.length;++i)
        {
            for(int j = i+1;j<a.length;++j)
            {
                if (b[i] > b[j])
                {
                    int tempb = b[j];
                    int tempa = a[j];

                    b[j] = b[i];
                    a[j] = a[i];

                    b[i] = tempb;
                    a[i] = tempa;
                }

            }
            result[0][i] = a[i];
            result[1][i] = b[i];
        }
        return result;
    }
}
