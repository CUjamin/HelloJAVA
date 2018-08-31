package cuj.question.zhaohang.q2;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/9/13.
 *
 公司最近组织团队建设活动，其中一个游戏有A,B两名参赛者参加，游戏规则如下：
 有m个不同身高的同时站成一排，A,B两个参赛者依次从最左边开始选择一名或两名同事出列（A先开始），
 直到所有同时都被选择完为止，最终计算两名参赛者所选择的同事的身高总和，总身高更高的人获胜。
 假设两名参赛者都足够聪明，请判断第一名参赛者是输还是赢？

 输入描述：
 输入的第一行为一个整数，代表同事个数m；
 输入第二行为m个正整数，代表每位同事的身高，用空格隔开

 输出描述：
 如果A获胜，输出true，输或打平输出false。

 示例：
 输入：
 3
 2 3 4
 输出：
 true
 *
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int m = Integer.parseInt(in.nextLine());
        int[] nums = new int[m];
        String[] numsStr = in.nextLine().split(" ");
        for(int i=0;i<m;++i)
        {
            nums[i]=Integer.parseInt(numsStr[i]);
        }
        handle(nums);
    }
    public static void handle(int[]nums)
    {
        int sumA = 0;
        int sumB = 0;
        boolean isA = true;
        for(int i=0;i<nums.length;++i)
        {
            if(isA)
            {
                sumA+=nums[i];
                if(i+1<nums.length&&nums[i]<=nums[i+1])
                {
                    sumA+=nums[++i];
                }
                isA = false;
            }
            else
            {
                sumB+=nums[i];
                if(i+1<nums.length&&nums[i]<=nums[i+1])
                {
                    sumB+=nums[++i];
                }
                isA = true;
            }
        }
        System.out.println(sumA>sumB);
    }
}
