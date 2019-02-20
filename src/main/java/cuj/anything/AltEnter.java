package cuj.anything;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by cujamin on 2018/1/9.
 */
public class AltEnter {
    public static void main(String[] args) {
        int x= calc(1,2);
        List<String> users = new ArrayList<String>();
        users.add("zhangsan");
        users.add("lisi");
        users.add("wangwu");
        for (String user : users) {
            System.out.println(user);
        }
        String firstName = "Zhang";
        String lastName = "San";

        String hello = String.format("FirstName: %s LastName:%s", firstName, lastName);
        String contact = new StringBuilder().append("a").append("b").append(firstName).append("c").append("d").append(lastName).toString();
        System.out.println(hello);
        String action = "a";

        System.out.println(action);

    }

    private static int calc(int a, int b) {
        return a+b;
    }

}
