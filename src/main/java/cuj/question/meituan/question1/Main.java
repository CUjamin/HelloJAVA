package cuj.question.meituan.question1;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/31.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in =  new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String str = in.nextLine();
        String[] nums = str.split(" ");
        int result = 1;
        for(int i=1;i<n;++i)
        {
            if(!nums[i-1].equals(nums[i]))result++;
        }
        System.out.println(result);

    }
}
