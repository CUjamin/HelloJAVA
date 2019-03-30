package cuj.anything.java.lang.reflect.office;

/**
 * Created by cujamin on 2017/8/23.
 */
public class Word implements OfficeAble{
    private String name;

    public Word() {
    }

    public Word(String name) {
        this.name = name;
    }

    public void start()
    {
        System.out.println("Word start");
    }
}
