package cuj.anything.java.lang.reflect.proxy;

/**
 * @Auther: cujamin
 * @Date: 2019/2/18 10:30
 * @Description:
 */
public class Solution {

    private String str;
    private int num;

    public Solution(String str, int num) {
        this.str = str;
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "str='" + str + '\'' +
                ", num=" + num +
                '}';
    }
}
