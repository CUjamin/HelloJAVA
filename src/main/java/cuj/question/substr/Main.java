package cuj.question.substr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by cujamin on 2017/4/28.
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("length : " + str.length());
        Map<Character,Integer> strsMap = new HashMap<Character, Integer>();
        long result = 0;
        int sp = 0;
        int ep = sp+1;
        while(ep<str.length())
        {
            if(str.charAt(ep-1)!=str.charAt(ep))
            {
                String newstr = str.substring(sp,ep);
                if((!strsMap.containsKey(newstr.charAt(0)))||(strsMap.get(newstr.charAt(0))<newstr.length())) strsMap.put(newstr.charAt(0),newstr.length());
                sp=ep;
                ep=sp+1;
            }
            else ep++;
        }
        for(Character key:strsMap.keySet())
        {
            result+=strsMap.get(key);
            System.out.println("newstr:"+key +" ; num : "+strsMap.get(key));
        }
        System.out.println(result);
    }
}
