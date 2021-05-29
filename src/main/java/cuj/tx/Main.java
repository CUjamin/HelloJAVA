package cuj.tx;

/**
 * @author cujamin
 * @date 2021/5/29
 * 输入一个整形数组，数组里有正数也有负数。
 * 数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。
 * 求所有子数组的和的最大值。要求时间复杂度为O(n)。 例如输入的数组为1, -2, 3, 10, -4, 7, 2, -5，和最大的子数组为3, 10, -4, 7, 2， 因此输出为该子数组的和18。
 */
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(sumMax(numbers));

    }
    private static int sumMax(Integer[] numbers){
        int sumMax = 0;
        int tmpSum = 0;
        for(Integer number:numbers){
            tmpSum+=number;
            if(tmpSum<0){
                tmpSum=0;
            }
            if(tmpSum>sumMax){
                sumMax = tmpSum;
            }
        }
        return sumMax;
    }
}
