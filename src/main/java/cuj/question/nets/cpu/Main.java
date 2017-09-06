package cuj.question.nets.cpu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/11.
 *一种双核CPU的两个核能够同时的处理任务，现在有n个已知数据量的任务需要交给CPU处理，
 * 假设已知CPU的每个核1秒可以处理1kb，每个核同时只能处理一项任务。n个任务可以按照任意顺序放入CPU进行处理，
 * 现在需要设计一个方案让CPU处理完这批任务所需的时间最少，求这个最小的时间。

 输入描述:
 输入包括两行：
 第一行为整数n(1 ≤ n ≤ 50)
 第二行为n个整数length[i](1024 ≤ length[i] ≤ 4194304)，表示每个任务的长度为length[i]kb，每个数均为1024的倍数。


 输出描述:
 输出一个整数，表示最少需要处理的时间

 输入例子1:
 5
 3072 3072 7168 3072 1024

 输出例子1:
 9216

 *
 */
public class Main {
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] tempstr = in.nextLine().split(" ");
        List<Integer> tempTask = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0;i<n;++i)
        {
            tempTask.add(Integer.parseInt(tempstr[i])/1024);
            sum+=Integer.parseInt(tempstr[i])/1024;
        }
        System.out.println((sum - cast(sum/2,tempTask))*1024);
    }
    public static int cast(int sum , List<Integer> tempTask)
    {
        System.out.println("sum: "+sum);
        if(tempTask.isEmpty()||sum<=0)return 0;
        int tempsum = 0;
        for(int i=0;i<tempTask.size();++i)
        {
            tempsum+=tempTask.get(i);
        }
        if(tempsum<sum)return tempsum;
        else
        {
            int value0 = tempTask.remove(0);
            if((sum-value0)<0)return 0;
            int result1 = cast( sum ,  tempTask);                   //不要value0
            int result2 = cast( sum - value0 , tempTask )+value0;   //要value0
            if(result1>sum)return result2;
            if(result2>sum)return result1;
            if(result1>result2)return result1;
            else return result2;
        }
    }
}
