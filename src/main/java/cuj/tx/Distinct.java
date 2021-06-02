package cuj.tx;

import com.google.common.collect.Lists;

import java.util.Arrays;

/**
 * @author cujamin
 * @date 2021/6/2
 */
public class Distinct {
    public static void main(String[] args) {
        Integer[] distinct = distinct(new Integer[]{5});
        System.out.println(Arrays.toString(distinct));
        distinct = distinct(new Integer[]{5,5,5,5,5});
        System.out.println(Arrays.toString(distinct));
        distinct = distinct(new Integer[]{5,5,5,5,5,1});
        System.out.println(Arrays.toString(distinct));
        distinct = distinct(new Integer[]{5,4,3,2,1});
        System.out.println(Arrays.toString(distinct));
    }
    private static Integer[] distinct(Integer[] numbers){
        int boundaryIndex = numbers.length;
        for(int nowNumIndex = 0;nowNumIndex<boundaryIndex;nowNumIndex++){
            int nowNumberRepeatCount = 0;
            for(int j=nowNumIndex+1;j<boundaryIndex;++j){
                if(numbers[nowNumIndex].equals(numbers[j])){
                    numbers[j]=numbers[boundaryIndex-1];
                    nowNumberRepeatCount++;
                }
            }
            boundaryIndex-=nowNumberRepeatCount;
        }
        return Arrays.copyOf(numbers,boundaryIndex);
    }
}
