package cuj.question.nets.campus.one1;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tempstr = in.nextLine();
        int x = Integer.parseInt(tempstr.split(" ")[0]);
        int f = Integer.parseInt(tempstr.split(" ")[1]);
        int d = Integer.parseInt(tempstr.split(" ")[2]);
        int p = Integer.parseInt(tempstr.split(" ")[3]);

        if(d<=0)
        {
            System.out.println(0);
            return;
        }
        int result = 0;
        result = (d+f*p)/(p+x);
        System.out.println(result);

    }
}
