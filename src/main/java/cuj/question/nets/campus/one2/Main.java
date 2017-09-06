package cuj.question.nets.campus.one2;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/12.
 */
public class Main {
    public static void main(String[]args)
    {
        String result = "";
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String x_str = in.nextLine();
        String y_str = in.nextLine();
        String[] x_str_s =  x_str.split(" ");
        String[] y_str_s =  y_str.split(" ");
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0;i<n;++i)
        {
            x[i] = Integer.parseInt(x_str_s[i]);
            y[i] = Integer.parseInt(y_str_s[i]);
        }

//        System.out.println();
        for(int i=0;i<n;++i)
        {
            if(i<n-1) result += (cast(x,y,i+1)+" ");
            else result += cast(x,y,i+1);
        }
        System.out.println(result);
//        System.out.println();
    }
    public static int cast(int[] x,int[] y,int n)
    {
//        System.out.println("h");
        if(n==0)return 0;
        if(n==1)return 0;
        int result = 0;
        int option_x = 0;
        int option_y = 0;

        for(int i=0;i<n;++i)
        {
            option_x+=x[i];
            option_y+=y[i];
        }

        option_x*=10;
        int tempx = option_x;
        tempx = tempx/n;
        if(tempx%10>=5)
        {
            option_x = option_x/n+10;
        }
        else option_x = option_x/n;
        option_x/=10;

        option_y*=10;
        int tempy = option_y;
        tempy = tempy/n;
        if(tempy%10>=5)option_y = option_y/n+10;
        else option_y = option_y/n;
        option_y/=10;
//        System.out.println("x:"+option_x+" y:"+option_y);

        for(int i=0;i<n;++i)
        {
            if(x[i]<option_x)
            {
                result+=(option_x-x[i]);
            }
            else
            {
                result+=(x[i]-option_x);
            }
            if(y[i]<option_y)
            {
                result+=(option_y-y[i]);
            }
            else
            {
                result+=(y[i]-option_y);
            }
        }

        return result;
    }

}
