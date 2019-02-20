package cuj.question.zhongxing.question5;

/**
 * Created by cujamin on 2017/8/29.
 * 计算两圆交叉部分面积
 * 输入 ax,ay,ar,bx,by,br
 * 输出：面积
 * 输出：0.000000
 */
public class Main {



    public static double sharedArea(double ra,double rb,double d)
    {
        if(d<ra+rb)return 0;
        double alpha = Math.acos((d*d+rb*rb-ra*ra)/(2*d*rb));
        double area = alpha*rb;
        double s = (d+ra+rb)/2;
        area -= Math.sqrt(s*(s-d)*(s-ra)*(s-rb))*2;
        return area;
    }
}
