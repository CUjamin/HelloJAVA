package cuj.question.jianzhiOffer.test13;

/**
 * Created by cujamin on 2017/6/19.
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Sulotion {
    public void reOrderArray(int [] array) {
        int is = 0 ;
        while(is<=array.length-1)
        {
            while(is<=array.length-1&&array[is]%2==0)++is;
            int t_s = is;
            while(is<=array.length-1&&t_s>0&&array[t_s-1]%2==0) {
                int tempnum = array[t_s];
                array[t_s] = array[t_s - 1];
                array[t_s - 1] = tempnum;
                t_s = t_s - 1;
            }
            ++is;
        }
    }
}
