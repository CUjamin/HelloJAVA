package cuj.question.zhongxing.question4;

/**
 * Created by cujamin on 2017/8/28.
 * 作者：康小城
 链接：https://www.nowcoder.com/discuss/34404
 来源：牛客网

 输入一个字符串数组，如果该字符串数组中的每个字符串的尾元素与下一个字符串的首元素是一样的，
 则认为该字符串数组是一个好的数组(忘记了原题，怎么称呼这样的数组，暂且这样叫吧)。
 如果是好的数组则返回1，第一个字符串的首元素与最后一个字符串的尾元素没有要求。
 int Array(char** arr, int length ){ //输入为字符串数组，及其长度
 }
 输入1:["abegc","cef","fnmde", "exy"],
 返回：1

 输入2:["agd", "dcnf", "deg"]
 返回：0
 */
public class Main {
    public static void main(String[]args) {
        String[] strs = {"abegc","cef","fnmde", "axy"};
        System.out.println(array(strs,4));
    }
    public static int array(String[] strs,int length)
    {
        if(length<=0)return 1;
        int result = 0;
        String nowHead = null;
        int tempSize = strs[0].length();
        String lastTail = strs[0].split("")[tempSize-1];
        int i=1;
        for(;i<length;++i)
        {
            tempSize = strs[i].length();
            nowHead = strs[i].split("")[0];
            System.out.println(i+" ; t:"+lastTail+"  h:"+nowHead);
            if(!nowHead.equals(lastTail))break;
            lastTail = strs[i].split("")[tempSize-1];
        }
        if(i==length)result=1;
        return result;
    }
}
