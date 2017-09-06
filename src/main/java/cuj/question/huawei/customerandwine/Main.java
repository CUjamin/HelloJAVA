package cuj.question.huawei.customerandwine;

import java.util.Scanner;

/**
 * 酒馆里有m个水龙头可供客人接啤酒，每个水龙每秒的出酒量相等，都是1
 * 现有N个客人准备接酒，他们出事的接酒顺序已经确定。将这些顾客按接就顺序从1到n编号
 * i号客人的接酒量是w_i。接酒开始时，1到m号客人各占一个龙头，并同时打开龙头接酒。
 * 当其中一个客人j完成其需求w_i后，下一个排队等候接酒的客人k马上接替j客人的位置开始接酒。
 * 这个换人过程是瞬间完成的，且没有任何酒的浪费。
 * 即x秒客人j完成接酒，客人k在x+1秒立即开始接酒。
 * 若接酒人数n不足m，则只有n个龙头可供酒，其他m-n个龙头关闭。
 * 现给出n名客人的接酒量，求所有客人接完就需要多长时间。
 *
 * 输入：第一行：n（人数） m（龙头数）
 *      第二行：n个w_i（1<=w_i<=100）表示客人接酒量
 * 输出：如果输入合法，输出接酒所需的时间
 *
 * 例：
 * 输入：
 * 5 3
 * 4 4 1 2 1
 * 输出：
 * 4
 *
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int n = Integer.parseInt(str1.split(" ")[0]);
        int m = Integer.parseInt(str1.split(" ")[1]);
        int[] needs =new int[n];
        for(int i=0;i<n;++i)
        {
            needs[i] = Integer.parseInt(str2.split(" ")[i]);
        }
        handle1(n,m,needs);
    }
    public static void handle1(int n,int m ,int[] needs)
    {
        int time = 0;
        int sum = 0;
        for(int i = 0;i<needs.length;++i)
        {
            sum+=needs[i];
        }
        while(sum>0)
        {
            ++time;
            int temp = Math.min(n,m);
            for(int i=0;i<needs.length;++i)
            {
                if(temp>0&&needs[i]>0)
                {
                    needs[i]--;
                    sum--;
                    temp--;
                }
            }
        }

        System.out.println(time);
    }
    public static void handle2(int n,int m ,int[] needs)
    {
        int time = 0;
        int success=0;
        while(success<n)
        {
            success=0;
            ++time;
            int temp = Math.min(n,m);
            for(int i=0;i<needs.length;++i)
            {
                if(temp>0&&needs[i]>0)
                {
                    needs[i]--;
                    temp--;
                }
                if(needs[i]<=0)success++;
            }
        }
        System.out.println(time);
    }
}
