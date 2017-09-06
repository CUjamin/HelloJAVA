package cuj.question.huawei.modulo;

import java.util.*;

/**
 * 100人围成一圈，每个人有一个编码，
 * 编号从1到100.他们从1开始依次报数，报道M的人自动退出圈圈，然后下一个人接着从1开始报数
 * 直到剩余的人数小于M。问最后剩余的人原先号码是多少。
 * M=3      58，91
 * M=4      34，45，97
 *
 * 输入：m
 * 输出：ERROR!            (若m>=1||m<=0)
 *      号码，以","相隔    （正常）
 *
 * 例：
 * 输入：
 * 3
 * 输出
 * 58，91
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int m = Integer.parseInt(in.nextLine().trim());
        if(m<=1||m>=100)
        {
            System.out.println("ERROR!");
            return;
        }
        else handle(m);
    }
    public static void handle(int m)
    {
        List<Integer> nums = new LinkedList<Integer>();
        for(int i=1;i<=100;++i)nums.add(i);

        int i = 0;
        int n = 0;//1~m
        int count = 100;
        while(count>=m)
        {
            ++n;
            if(n%m==0)
            {
                nums.remove(i);
                count--;
            }
            else ++i;
            n%=m;
            i%=count;
        }
        printResult(nums);
    }
    public static void printResult(List<Integer> nums)
    {
        boolean isbegin = false;
        for(int num:nums)
        {
            if(!isbegin)
            {
                System.out.print(num);
                isbegin = true;
            }
            else
            {
                System.out.print(","+num);
            }
        }
    }
}
