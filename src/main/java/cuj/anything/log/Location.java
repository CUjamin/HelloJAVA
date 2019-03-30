package cuj.anything.log;

/**
 * @Auther: cujamin
 * @Date: 2019/3/20 11:09
 * @Description:
 */

public class Location {
    public void getInfo(){
        String location="";
        StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
        location = "类名："+stacks[2].getClassName() + "\n函数名：" + stacks[2].getMethodName()
                + "\n文件名：" + stacks[2].getFileName() + "\n行号："
                + stacks[2].getLineNumber() + "";
        System.out.println(location);
    }

}
