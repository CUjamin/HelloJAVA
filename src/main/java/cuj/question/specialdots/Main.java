package cuj.question.specialdots;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by cujamin on 2017/9/5.
 * 在平面上有N个点，他们有各自的速度向量。现在我们给出时刻0时他们的位置，还有各自的速度向量。
 * 在同一时刻，距离最远的一对称之为special dots。现在，次u在某一时刻，special dots之间的距离最近，并输出改距离
 * 输入：          点个数                          n（2<=n<=300）
 *      n行：     坐标x，坐标y，速度vx，速度vy      x,y,vx,vy(<-10000<=x,y<=10000 , -100<vx,vy<100)
 *输出：           每行两个数字：时刻 距离
 *                 （精确小数点后两位）
 *例：           2
 *              0       0       1       0
 *              2       0       -1      0
 *              4
 *              27      27      0       2
 *              58      88      -8      -1
 *              -22     7       1       -1
 *              -38     -26     5       9
 2
 0 0 1 0
 2 0 -1 0

 1.00 0.00

 4
 27 27 0 2
 58 88 -8 -1
 -22 7 1 -1
 -38 -26 5 9

 8.89 81.00
 *
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        while(input.hasNext())
        {
            int n = Integer.parseInt(input.nextLine());
            double[][] local = new double[n][2];
            double[][] spead = new double[n][2];
            for(int i = 0;i<n;++i)
            {
                String[] strs = input.nextLine().split(" ");
                local[i][0] = Float.parseFloat(strs[0]);
                local[i][1] = Float.parseFloat(strs[1]);
                spead[i][0] = Float.parseFloat(strs[2])/100;
                spead[i][1] = Float.parseFloat(strs[3])/100;
            }
            double specialdots = Double.MAX_VALUE;
            int time=0;
            while(true)
            {
                double max = Double.MIN_VALUE;
                for(int i=0;i<n-1;++i)
                {
                    for(int j =i+1;j<n;++j)
                    {
                        double disx = (local[i][0]+spead[i][0]*time)-(local[j][0]+spead[j][0]*time);
                        double disy = (local[i][1]+spead[i][1]*time)-(local[j][1]+spead[j][1]*time);
                        double dis = Math.sqrt(disx*disx+disy*disy);
                        if(dis>max)max = dis;
                    }
                }

                if(max<specialdots)
                {
                    specialdots = max;
                    ++time;
                }
                else
                {
                    break;
                }
            }
            time--;
            DecimalFormat df = new DecimalFormat("0.00");
            double resultTime = (double)time;
            resultTime/=100;
            System.out.println(df.format(resultTime)+" "+df.format(specialdots));
        }
    }
}
