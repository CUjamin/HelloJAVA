package cuj.question.jianzhiOffer.test2;

/**
 * Created by cujamin on 2017/5/24.
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为
 * We Are Happy.
 * 则经过替换之后的字符串为
 * We%20Are%20Happy。
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        if(null==str)return null;
        StringBuffer newstr = new StringBuffer();
        for(int i = 0 ; i<str.length();++i)
        {
            if(str.charAt(i)==' ')
            {
                newstr.append("%20");
            }
            else newstr.append(str.charAt(i));
        }
        return newstr.toString();
    }
}
