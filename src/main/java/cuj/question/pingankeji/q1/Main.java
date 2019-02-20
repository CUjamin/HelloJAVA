package cuj.question.pingankeji.q1;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/9/21.
 * n=100,a1=0,a2=0,a3=5,a4=6,a5=3,a6=2
 */
public class Main {
    public static final int[] defaultMys = {1,5,10,20,50,100};
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String[] temps = in.nextLine().split(",");
        int n = Integer.parseInt(temps[0].split("=")[1]);
        int[] mys = new int[6];
        for(int i=1;i<temps.length;++i)
        {
            mys[i-1] = Integer.parseInt(temps[i].split("=")[1]);
        }
        System.out.println(handle(mys,n,0));
    }

    private static int handle(int[] mys, int n,int mothed) {
        int tempmothed =0;
        if(n==0)return 0;
        else
        {
            for(int i=mys.length-1;i>=0;--i)
            {
                if(mys[i]!=0&&n>=defaultMys[i])
                {
                    int mothed1 = 0;
                    int mothed2 = 0 ;
                    mys[i]--;
                    mothed1 = handle(mys,n-defaultMys[i],mothed);//使用一张i
                    if(mothed1>0)
                    {
                        tempmothed+=mothed1;
                    }
                    mys[i]=0;
                    mothed2 = handle(mys,n,mothed);//不使用i
                    if(mothed2>0)
                    {
                        tempmothed+=mothed2;
                    }

                    break;
                }
            }
        }
        return mothed+tempmothed+1;
    }
}
