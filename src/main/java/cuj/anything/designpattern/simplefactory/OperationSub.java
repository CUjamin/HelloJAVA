package cuj.anything.designpattern.simplefactory;

/**
 * @Author: cujamin
 * @ProjectName: HelloJAVA
 * @Date: 2019/5/13 8:45 PM
 * @Description: ${description}
 */
public class OperationSub extends Operation{
    public double getResult(){
        double result =getNumberA()-getNumberB();
        return result;
    }
}
