package cuj.question.huawei.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cujamin on 2017/7/4.
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */
public class Main {
    private static List<String> list = new ArrayList<String>();
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            sub(in.nextLine());
        }
        while(list.size()>0)
        {
            System.out.println(list.remove(0));
        }
    }
    public static void sub(String str)
    {
        while(str.length()>8)
        {
            list.add(str.substring(0,8));
            str = str.substring(8);
        }
        str+="0000000";
        list.add(str.substring(0,8));
    }
}
