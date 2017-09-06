package cuj.question.lianjia.one1;

import java.io.*;
import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/19.
 */
public class Main {
    public static void main(String[]args)
    {
        File file = new File("random.in");
        BufferedReader reader = null;
        int n = 0;
        int[] num = null;

        try
        {
            reader = new BufferedReader(new FileReader(file));
            n = Integer.parseInt(reader.readLine());
            num = new int[n];
            String numstr = reader.readLine();
            for(int i=0;i<n;++i)
            {
                num[i] = Integer.parseInt(numstr.split(" ")[i]);
            }
            int[] result = sort(num);


        }
        catch (FileNotFoundException f)
        {
            System.out.println(f);
        } catch (IOException i)
        {
            System.out.println(i);
        }
    }
    public static int[] sort(int[] num)
    {
        int[] result = new int[num.length];
        for(int i= 0;i<num.length;++i)
        {
            for(int j = i+1;j<num.length;++j)
            {
                if (num[i] > num[j])
                {
                    int temp = num[j];

                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
        return result;
    }
}
