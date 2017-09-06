package cuj.question.ali.moni.cus17.intf;

import java.util.Stack;

/**
 * Created by cujamin on 2017/8/25.
 */
public class MyStackImpl {
    volatile private Stack<Object> stack = new Stack<Object>();
    private MyStackImpl(){
    }

    public Stack<Object> getStack(){
        return this.stack;
    }

    public Object getElement(int index){
        if(index<0 ||index > (this.stack.size()-1)){
            return null;
        }

        return this.stack.get(index);
    }

    public void removeELement(int index){
        if(index<0 || index > (this.stack.size()-1)){
            return;
        }
        this.stack.remove(index);
    }
}
