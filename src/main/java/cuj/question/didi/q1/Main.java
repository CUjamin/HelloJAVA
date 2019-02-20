package cuj.question.didi.q1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args)
    {
        try
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(in.readLine());
            String[] strs = in.readLine().split(" ");
            int[] nums = new int[strs.length];
            for (int i=0;i<n;++i)
            {
                nums[i] = Integer.parseInt(strs[i]);
            }
            handle(nums);
        }catch (IOException io)
        {
            io.printStackTrace();
        }
    }
    public static void handle(int[]nums)
    {
        int count=0;
        int i=1;
        if(nums[0]==0)count++;
        while(i<nums.length)
        {
            if(nums[i]==0)
            {
                i++;
                count++;
            }
            else if(nums[i]==nums[i-1]&&nums[i-1]>=1&&nums[i]<=nums.length)
            {
                count++;
                i+=2;
            }
            else
            {
                i++;
            }
        }
        System.out.println(count);
    }
}
