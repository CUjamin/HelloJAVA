package cuj.anything.java.lang.annotation;

/**
 * Created by cujamin on 2018/5/3.
 */
public class AlipayTradePayModel {

    @ApiField("test_string_1")
    private String testStr1;

    @ApiField("test_string_1")
    private String testStr2;

    public String getTestStr1() {
        return testStr1;
    }

    public void setTestStr1(String testStr1) {
        this.testStr1 = testStr1;
    }

    public String getTestStr2() {
        return testStr2;
    }

    public void setTestStr2(String testStr2) {
        this.testStr2 = testStr2;
    }
    public String getInfo() {
        return "AlipayTradePayModel{" +
                "testStr1='" + testStr1 + '\'' +
                ", testStr2='" + testStr2 + '\'' +
                '}';
    }
}
