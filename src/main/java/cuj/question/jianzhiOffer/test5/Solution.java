package cuj.question.jianzhiOffer.test5;

import java.util.Stack;

/**
 * Created by cujamin on 2017/5/24.
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if(stack1.empty())stack1.push(node);
        else
        {
            while(!stack1.empty())
            {
                stack2.push(stack1.pop());
            }
            stack1.push(node);
            while(!stack2.empty())
            {
                stack1.push(stack2.pop());
            }
        }
    }

    public int pop() {
        if(stack1.empty())return 0;
        else return stack1.pop();
    }
}
