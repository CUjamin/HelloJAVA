package cuj.anything.fastjson.resouce;

/**
 * Created by cujamin on 2018/2/2.
 */
public class Person {
    private String name;

    private double age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
