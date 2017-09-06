package cuj.question.didi.question2;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/26.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String tempNum = in.nextLine();
        int n = Integer.parseInt(in.nextLine());
        String[] numStrs = tempNum.split(" ");
        int[] nums = new int[numStrs.length];
        boolean start = false;
        for(int i = 0;i<numStrs.length;++i)
        {
            nums[i] = Integer.parseInt(numStrs[i]);
        }
        System.out.println(theNum(nums,n));
    }
    public static int theNum(int[] nums , int n)
    {
        int result = 0;
        for(int i = 0;i<n;++i)
        {
            for(int j=i+1;j<nums.length;++j)
            {
                if(nums[i]<nums[j])
                {
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        result = nums[n-1];
        return result;
    }
}
