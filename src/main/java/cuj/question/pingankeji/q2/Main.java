package cuj.question.pingankeji.q2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cujamin on 2017/9/21.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());
        handle(n);
    }
    public static void handle(int n)
    {
        List<Integer> nums = new LinkedList<Integer>();
        for(int i=1;i<=n;++i)nums.add(i);

        int i = 0;
        int m = 0;//1~3
        int last = 0;
        int count = n;
        while(count>=0)
        {
            ++m;
            if(m%3==0)
            {
                last=nums.remove(i);
                count--;
            }
            else ++i;
            if(count==0)break;
            m%=3;
            i%=count;
        }
        System.out.println(last);
    }
}
