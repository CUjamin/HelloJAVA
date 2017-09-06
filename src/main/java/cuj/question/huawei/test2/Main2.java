package cuj.question.huawei.test2;

import java.util.*;

/**
 * Created by cujamin on 2017/7/4.
 */
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s =sc.nextLine();
            f1(s);
        }
    }
    public static void f1(String s){
        Set<Character> set = new TreeSet<Character>();
        List<Character> list = new ArrayList<Character>();
        List<Character> list1 = new ArrayList<Character>();
        Map<Character,Integer> map= new HashMap<Character,Integer>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(set.add(ch[i]))list.add(ch[i]);
            list1.add(ch[i]);
        }
        int cnt=0;
        for(int j=0;j<list.size();j++){
            for(int i=0;i<list1.size();i++){
                if(list1.get(i)==list.get(j))
                    cnt++;}
            map.put(list.get(j), cnt);
            cnt=0;
        }
        for(char cr:map.keySet())
        {
            System.out.println(cr+" : "+map.get(cr));
        }

        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if((int)map.get(list.get(i))<(int)map.get(list.get(j)))
                {
                    Character t = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, t);
                }
                if((int)map.get(list.get(i))==(int)map.get(list.get(j)))
                {

                    if((char)list.get(i)>(char)list.get(j))
                    {
                        Character t = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, t);
                    }
                }

            }
        }

        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i));
    }
}
