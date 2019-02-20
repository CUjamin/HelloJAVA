package cuj.question.sohu.q2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cujamin on 2017/9/17.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] numStrs = in.nextLine().split(" ");
        List<Integer> nums = new LinkedList<Integer>();
        int a = 0;
        int i = 0;
        int j = numStrs.length-1;
        int mid = 0;
        while(i<=j)
        {
            int numA = Integer.parseInt(numStrs[i]);
            int numB = Integer.parseInt(numStrs[j]);
            if(numA==numB)
            {
                nums.add(a,numA);
                if(i==j)
                {
                    mid = numA;
                }
                i++;
                j--;
            }
            else if(numA<numB)
            {
                nums.add(a, numA);
                i++;
            }
            else
            {
                nums.add(a,numB);
                j--;
            }

            a++;
        }

        int sum = 0;
        while(nums.size()>0)
        {
            int num=nums.remove(0);
            sum+=num;
        }
        sum*=2;
        sum-=mid;
        System.out.println(sum);
    }
}
