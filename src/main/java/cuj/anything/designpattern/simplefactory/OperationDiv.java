package cuj.anything.designpattern.simplefactory;

/**
 * @Author: cujamin
 * @ProjectName: HelloJAVA
 * @Date: 2019/5/13 8:47 PM
 * @Description: ${description}
 */
public class OperationDiv extends Operation{
    public double getResult()throws Exception{
        if(getNumberB()==0){
            throw new Exception("除数不能为  0 ");
        }
        double result = getNumberA()/getNumberB();
        return result;
    }
}
