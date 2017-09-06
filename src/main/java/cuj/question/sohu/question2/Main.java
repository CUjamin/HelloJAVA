package cuj.question.sohu.question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/28.
 * 装箱问题；
 *
0 0 4 0 0 1
7 5 1 0 0 0
0 0 0 0 0 0
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int n = 0;
        List<int[]> list = new ArrayList<int[]>();
        while(in.hasNext())
        {
            String str = in.nextLine();
            int[] order = new int[6];
            int flag = 0;
            for(int i = 0;i<6;++i)
            {
                order[i] = Integer.parseInt(str.split(" ")[i]);
                if(order[i]==0)++flag;
            }
            if(flag==6)break;
            else
            {
                n++;
                list.add(order);
            }
        }
        for(int i =0 ;i<n;++i)
        {
            System.out.println(needBagCount(list.get(i)));
        }
    }
    public static int needBagCount(int[] order)
    {
        int result = order[5];
        int rest2 = 0;
        int rest1 = 0;

        //5
        if(order[4]>0)
        {
            result += order[4];
            rest1 += order[4]*(6*6*6-5*5*5);
        }

        //4
        if(order[3]>0)
        {
            result += order[3];
            rest2 += order[3]*(3*3*3-2*2*2);
        }

        //3
        if(order[2]>0)
        {
            int count = order[2]/8;
            count++;
            result += count;
            int rest = count*8 - order[2];
            switch (rest)
            {
                case 1:
                    rest1+=1;
                    rest2+=19;
                    break;
                case 2:
                    rest1+=2;
                    rest2+=30;
                    break;
                case 3:
                    rest1+=5;
                    rest2+=68;
                    break;
                case 4:
                    rest1+=9;
                    rest2+=36;
                    break;
                case 5:
                    rest1+=11;
                    rest2+=47;
                    break;
                case 6:
                    rest1+=15;
                    rest2+=42;
                    break;
                case 7:
                    rest1+=19;
                    rest2+=37;
                    break;
            }
        }

        if(order[1]>rest2)
        {
            order[1]-=rest2;
            rest2=0;

            int count = order[1]/27;
            count++;
            result += count;
            int rest = count*27 - order[1];
            rest1+=rest*8;
        }
        else
        {
            rest1 = (rest2-order[1])*8;
        }


        if(order[0]>rest1)
        {
            order[0]-=rest1;
            int count = order[0]/216;
            result+=count;
        }

        return result;
    }
}

