package cuj.question.sohu.q1;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by cujamin on 2017/9/17.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        String[] orders = temp.split("/");
        handle(orders);
    }

    private static void handle(String[] orders) {

        String result = "";
        Stack<String> os = new Stack<String>();
        for(int i=1;i<orders.length;++i)
        {

            if(orders[i].equals(".")||orders[i].equals("//"))
            {
                continue;
            }
            if(!orders[i].equals(".."))os.push(orders[i]);
            else
            {
                os.pop();
            }
        }


        if(os.empty())
        {
            result = "/";
        }
        else
        {
            while(!os.empty())
            {
                result = "/"+os.pop()+result;
            }
        }


        System.out.println(result);
    }
}
