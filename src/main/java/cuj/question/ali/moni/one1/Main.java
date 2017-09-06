package cuj.question.ali.moni.one1;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/21.
 */
public class Main {
/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int pick(int[] peaches) {
        int result= 0;
        if(peaches.length==0)return 0;
        for(int i=0;i<peaches.length;++i)
        {
            int max = getnum(peaches,i);
            if(max>result)result = max;
        }
        return result;
    }
    static int getnum(int[] peaches,int start)
    {
        int result = 1;
        for(int i=start;i<peaches.length-1;++i)
        {
            if(peaches[i]<=peaches[i+1])result++;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int trees = Integer.parseInt(in.nextLine().trim());
        int[] peaches = new int[trees];
        for (int i = 0; i < peaches.length; i++) {
            peaches[i] = Integer.parseInt(in.nextLine().trim());
        }
        System.out.println(pick(peaches));
    }
}
