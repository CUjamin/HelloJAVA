package cuj.question.huawei.sortrandom;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by cujamin on 2017/9/6.
 */

public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            int n = Integer.parseInt(in.nextLine());
            int[]nums = new int[n];
            for(int i = 0;i<n;++i)
            {
                nums[i] = Integer.parseInt(in.nextLine());
            }
            nums = sort(nums);
//            System.out.println(nums[0]);
            int last = 0;
            for(int i = 1;i<n;++i)
            {
                if(nums[i]!=last)
                {
                    System.out.println(nums[i]);
                }
                last = nums[i];
            }
        }
    }
    public static int[] sort(int[]nums)
    {
        Arrays.sort(nums);
        return nums;
    }
    public static void mainTree(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            TreeSet<Integer> set=new TreeSet<Integer>();
            int n=sc.nextInt();
            if(n>0){
                for(int i=0;i<n;i++){
                    set.add(sc.nextInt());
                }
            }
            for(Integer i:set){
                System.out.println(i);
            }
        }
    }


}




//public class Main {
//    public static void main(String[]args) {
//        Scanner in = new Scanner(System.in);
//        Map<Character,Integer> map = new HashMap<Character,Integer>();
//        map.put('A',10);
//        map.put('B',11);
//        map.put('C',12);
//        map.put('D',13);
//        map.put('E',14);
//        map.put('F',15);
//
//        while(in.hasNext())
//        {
//            String strs = in.nextLine().split("0x")[1];
//            char[] numX = strs.toCharArray();
//            int result = 0;
//            for(int i=0;i<numX.length;++i)
//            {
//                result*=16;
//                int num = 0;
//                if(numX[i]>='0'&&numX[i]<='9')
//                {
//                    num = numX[i]-'0';
//                }
//                else
//                {
//                    num =map.get(numX[i]);
//                }
//                result+=num;
//            }
//            System.out.println(result);
//        }
//
//    }
//}
