package cuj.question.didi.q2;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        handle(n);
    }
    public static void handle(int n)
    {
        int i=n;
        int count=0;
        while(i>0)
        {
            count++;
            if(isTrue(count))
            {
                i--;
            }
        }
        System.out.println(count);
    }
    public static boolean isTrue(int num)
    {

        while(num%2==0)num/=2;
        while(num%3==0)num/=3;
        while(num%5==0)num/=5;
        if(num==1)return true;
        else return false;
    }
}
