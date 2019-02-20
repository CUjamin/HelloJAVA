package cuj.question.jingdong.q1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by cujamin on 2017/9/8.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String input =in.next();

        int result=1;
        int tot =0;
        for(int i =input.length()-1; i>=0;i--) {
            if(input.charAt(i)==')')tot++;
            else if(input.charAt(i)=='(')
            {
                result=result*tot;
                tot--;
            }
        }
        System.out.println(result);
    }
    public static void handle(ArrayList<ArrayList<String>> list)
    {
        long result = 1;
        for(ArrayList<String> tempList:list)
        {
            long tempCont = 1;

            for(int i=1;i<=tempList.size()/2;++i)
            {
                tempCont*=i;
            }
            result*=tempCont;

        }
        System.out.println(result);
    }



    public static void temp()
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strs = str.split("");
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        int i=1;
        while(i<strs.length)
        {
            ArrayList<String> tempList= new ArrayList<String>();
            int count = 1;
            tempList.add(strs[i]);
            i++;
            while(count>0)
            {
                if(strs[i].equals("("))count++;
                else count--;

                tempList.add(strs[i]);
                i++;
            }
            list.add(tempList);
        }
        handle(list);

    }
}
