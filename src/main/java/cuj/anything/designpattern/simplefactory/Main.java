package cuj.anything.designpattern.simplefactory;

import java.util.Scanner;

/**
 * @Author: cujamin
 * @ProjectName: HelloJAVA
 * @Date: 2019/5/13 8:35 PM
 * @Description: ${description}
 */
public class Main {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("请输入数字A：");
            double numberA = in.nextDouble();
            System.out.println("请输入运算符（+、-、*、/）：");
            String operate = in.next();
            System.out.println("请输入数字B：");
            double numberB = in.nextDouble();

            Operation operation = OperationFactory.createOperation(operate);
            operation.setNumberA(numberA);
            operation.setNumberB(numberB);
            double result = operation.getResult();
            System.out.println("结果是："+result);
        }catch (Exception e){
            System.out.println("异常："+e.getMessage());
        }
    }
}
