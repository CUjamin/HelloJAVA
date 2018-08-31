package cuj.question.sogou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by cujamin on 2017/9/8.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        sin.nextLine();
        int i = 0;
        Double[] point = new Double[n];
        while(i < n) {
            point[i] = sin.nextDouble();
            ++ i;
        }
        Double maxLen = Double.MIN_VALUE;
        int j = 0, k = n-1;
        boolean isFirst = true;
        int startPoint = 0;
        Double sub;
        while (j < k) {
            sub = point[k] - point[j];
            if (sub > Double.valueOf("180")) {
                if (isFirst) {
                    startPoint = j;
                    isFirst = false;
                }
                sub = Double.valueOf("360") - sub;
                j ++;
            }
            else
            {
                if (!isFirst) {
                    j = startPoint;
                    isFirst = true;
                    k --;
                } else {
                    if (sub > maxLen) {
                        maxLen = sub;
                    }
                    break;
                }
            }

            if (sub > maxLen) {
                maxLen = sub;
            }
        }
        System.out.printf("%7.8f",maxLen);
    }
    public static void temp()
    {
        try
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(in.readLine());
            double[] nums = new double[n];
            double max = 0;
            for(int i=0;i<n;++i)
            {
                nums[i]=Double.parseDouble(in.readLine())%360;
            }
            for(int i=0;i<n-1;++i) {
                for (int j = i+1;j<n; ++j)
                {
                    double temp = nums[j]-nums[i];
                    if(temp>180)temp=360-temp;
                    if(temp>max)max=temp;
                }
            }
            DecimalFormat decimalFormat = new DecimalFormat("0.00000000");
            System.out.println(decimalFormat.format(max));
        }catch (IOException io)
        {
            System.out.println("IOException");
            io.printStackTrace();
        }
    }
}
