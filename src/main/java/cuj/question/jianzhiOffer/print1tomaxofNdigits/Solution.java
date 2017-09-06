package cuj.question.jianzhiOffer.print1tomaxofNdigits;

/**
 * Created by cujamin on 2017/9/6.
 */
public class Solution {
    public static void main(String[]args)
    {
        print1tomaxofNdigits(3);
    }
    public static void print1tomaxofNdigits(int n)
    {
        if(n<=0)return;
        char[] number = new char[n+1];
        number[0]='0';
        for(int i=0;i<10;++i)
        {
            number[0] = (char)(i+'0');
            print1tomaxofNdigits(number,n,0);
        }
    }
    public static void print1tomaxofNdigits(char[] number , int length,int index)
    {
        if(index==length-1)
        {
            printNumber(number);
            return;
        }
        for(int i=0;i<10;++i)
        {
            number[index+1]=(char)(i+'0');
            print1tomaxofNdigits(number,length,index+1);
        }
    }
    public static void printNumber(char[] number)
    {
        boolean isBeginning0 = true;
        for(int i =0;i<number.length;++i)
        {
            if(isBeginning0&&number[i]!='0')isBeginning0=false;
            if(!isBeginning0)System.out.print(number[i]);
        }
        System.out.println();
    }
}
