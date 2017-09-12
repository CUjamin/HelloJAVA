package cuj.question.tengxun.q1;

import java.util.Arrays;

/**
 * Created by cujamin on 2017/9/12.
 */
public class Main {
    public static void main(String[]args)
    {
        int[] nums = {10,2,2,7,40,160};
        handle(nums);
    }
    public static void handle(int[] nums)
    {
        int count = 0;
        Arrays.sort(nums);
        for(int i1=0;i1<nums.length-3;++i1)
        {
            for(int i2=i1+1;i2<nums.length-2;++i2)
            {
                for(int i3=i2+1;i3<nums.length-1;++i3)
                {
                    for(int i4=i3+1;i4<nums.length;++i4)
                    {
                        if(nums[i1]*nums[i2]*nums[i3]==nums[i4])
                        {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);

    }
}
