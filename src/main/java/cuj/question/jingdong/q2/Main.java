package cuj.question.jingdong.q2;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/9/8.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        handle(n);
    }
    public static void handle(int n)
    {
        long result=0;
        for(int i=1;i<=n;++i)
        {
            for(int j=1;j<=n;++j)
            {
                if(i!=j)
                {
                    result+=2;
                }
                else
                {
                    result++;
                }
            }
        }
        result=result%1000000007;
        System.out.println(result);
    }
}
