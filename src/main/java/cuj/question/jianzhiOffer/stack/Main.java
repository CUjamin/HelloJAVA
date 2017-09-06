package cuj.question.jianzhiOffer.stack;

/**
 * Created by cujamin on 2017/9/4.
 */
public class Main {
    public static void main(String[]args)
    {
        Solution sl = new Solution();
        sl.push(3);
        System.out.println(sl.min());
        sl.push(4);
        System.out.println(sl.min());
        sl.push(2);
        System.out.println(sl.min());
        sl.push(3);
        System.out.println(sl.min());
        sl.pop();
        System.out.println(sl.min());
        sl.pop();
        System.out.println(sl.min());
        sl.pop();
        System.out.println(sl.min());
        sl.push(0);
        System.out.println(sl.min());

    }
}
