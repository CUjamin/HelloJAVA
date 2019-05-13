package cuj.anything.designpattern.simplefactory;

/**
 * @Author: cujamin
 * @ProjectName: HelloJAVA
 * @Date: 2019/5/13 8:44 PM
 * @Description: ${description}
 */
public class OperationAdd extends Operation{
    public double getResult(){
        double result = getNumberA()+getNumberB();
        return result;
    }
}
