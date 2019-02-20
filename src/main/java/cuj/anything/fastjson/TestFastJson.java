package cuj.anything.fastjson;

import com.alibaba.fastjson.JSONObject;
import cuj.anything.fastjson.resouce.Person;
import cuj.anything.fastjson.resouce.Person2;

/**
 * Created by cujamin on 2018/2/2.
 */
public class TestFastJson {
    public static void main(String[] args) {
        test1();
        System.out.println();
        test2();
    }

    private static void test1()
    {
        Person2 person2 = new Person2("no");
        String str = JSONObject.toJSONString(person2);
        System.out.println(str);

        Person person = JSONObject.parseObject(str,Person.class);
        String str2 = JSONObject.toJSONString(person);
        System.out.println(str2);
    }

    private static void test2()
    {
        Person person = new Person("name",9);
        String str = JSONObject.toJSONString(person);
        System.out.println(str);

        Person2 person2 = JSONObject.parseObject(str,Person2.class);
        String str2 = JSONObject.toJSONString(person2);
        System.out.println(str2);
    }
}
