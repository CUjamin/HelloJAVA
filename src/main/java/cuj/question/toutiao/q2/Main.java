package cuj.question.toutiao.q2;

import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] likeLevelStr = in.nextLine().split(" ");
        int q = Integer.parseInt(in.nextLine());

        int[] result = new int[q];
        for(int i =0;i<q;++i)
        {
            String[] dataStrs = in.nextLine().split(" ");
            int l = Integer.parseInt(dataStrs[0]);
            int r = Integer.parseInt(dataStrs[1]);
            int k = Integer.parseInt(dataStrs[2]);

            int num=0;

            for(int j = l-1;j<r-1;++j)
            {
                if(j>=0&&j<n&&k==Integer.parseInt(likeLevelStr[j]))num++;
            }

            result[i]=num;
        }

        for(int i=0;i<q;i++) {
            System.out.println(result[i]);
        }
    }
}
