package cuj.question.jianzhiOffer.stack;

/**
 * Created by cujamin on 2017/9/4.
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class Solution {

    int[] nums = null;
    int size = 0;
    int n = 0;

    public void push(int node) {
        if(size==0)
        {
            size = 8;
            nums = new int[size];
        }
        nums[n++] = node;
    }

    public void pop() {
        --n;
    }

    public int top() {
        int result = nums[n-1];
        --n;
        return result;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;++i)
        {
            if(nums[i]<min)min=nums[i];
        }
        return min;
    }
}
