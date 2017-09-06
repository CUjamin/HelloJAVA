package cuj.question.nets.campus.one3;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/12.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String tempstr = in.nextLine();
        int n = Integer.parseInt(tempstr.split(" ")[0]);
        int k = Integer.parseInt(tempstr.split(" ")[1]);
        int result = n+1;
        result+=num(n,k);
        if(n==0)
        {
            System.out.println(0);
            return;
        }
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(result);
    }
    public static int num(int n,int k)
    {
        if(n==1)return 0;
        int result = 0;
        if(k>=n)result+=n;


        return result;
    }
}
