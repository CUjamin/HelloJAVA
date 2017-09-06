package cuj.question.huawei.test2;

import java.util.*;

/**
 * Created by cujamin on 2017/7/4.
 * 如果统计的个数相同，则按照ASII码由小到大排序输出 。如果有其他字符，则对这些字符不用进行统计。
 * 实现以下接口：
 * 输入一个字符串，对字符中的各个英文字符，数字，空格进行统计（可反复调用）
 * 按照统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASII码由小到大排序输出
 * 清空目前的统计结果，重新统计
 * 调用者会保证：
 * 输入的字符串以‘\0’结尾。
 *
 * 输入描述:    输入一串字符。
 * 输出描述:
 * 对字符中的各个英文字符（大小写分开统计），数字，空格进行统计，并按照统计个数由多到少输出,
 * 如果统计的个数相同，
 * 则按照ASII码由小到大排序输出 。如果有其他字符，则对这些字符不用进行统计
 * 示例1
 * 输入
 * aadddccddc
 * 输出
 * dca
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            statistics(in.nextLine());
        }
    }
    public static void statistics(String str)
    {
        String result = "";
        Map<Character,Integer> charMap = new HashMap<Character, Integer>();
        char[] chars=str.toCharArray();
        for(int i =0 ; i<chars.length;++i)
        {
            if(charMap.containsKey(chars[i]))
            {
                charMap.put(chars[i],charMap.get(chars[i])+1);
            }else
            {
                charMap.put(chars[i],1);
            }
        }
        while(charMap.size()>0) {
            int max = 0;
            char maxChar = 0;
            for (char cr : charMap.keySet()) {
                if (charMap.get(cr) > max) {
                    max = charMap.get(cr);
                    maxChar = cr;
                }
                else if (charMap.get(cr) == max&&cr<maxChar)
                {
                    max = charMap.get(cr);
                    maxChar = cr;
                }
            }
            result+=maxChar;
            charMap.remove(maxChar);
        }
        System.out.println(result);
    }
}
