package cuj.question.meituan.question2;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/31.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] str1 = new String[n];
        for(int i= 0;i<n;++i)
        {
            str1[i]=in.nextLine();
        }
        str1 = sort(str1);
        int m = Integer.parseInt(in.nextLine());
        String[] str2 = new String[m];
        for(int j=0;j<m;++j)
        {
            str2[j]=in.nextLine();
        }
        str2 = sort(str2);
        for(int i=0;i<n;++i)
        {
            int flag = 0;
            for(int j= 0;j<m;++j)
            {
                if(str1[i].equals(str2[j])) {
                    flag++;
                }
            }
            if(flag==0)System.out.println(str1[i]);
        }
    }
    public static String[] sort(String[] strs)
    {
        for(int i =0;i<strs.length;++i)
        {
            for (int j=i+1;j<strs.length;++j)
            {
                if(strs[i].length()>strs[j].length())
                {
                    String temp = strs[i];
                    strs[i]=strs[j];
                    strs[j]=temp;
                }
            }
        }
        return strs;
    }
}
