package cuj.question.ali.cumpus18.question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/25.
 *
 *  * 作者：Quinta--
 链接：https://www.nowcoder.com/discuss/34905
 来源：牛客网
 2.在快递公司干线运输的车辆使用中，存在着单边车和双边车的两种使用场景，例如 北京中心-杭州中心，两个分拨中心到彼此的单量对等，
 则可以开双边车（即同一辆车可以往返对开），而当两个中心的对发单量不对等时，则会采用单边车，并且双边车的成本是低于单边车的，
 即将两辆对开的单边车合并为一辆往返的双边车是能够节省运力成本的
 单边车优化原则：
 将单边车优化的规则进行可抽象为以下三种（A,B,C均表示分拨中心）：
 规则-1: A-B单边车，B-A单边车 优化方案：将A-B和B-A的两辆单边车合并为双边；
 规则-2: A-B单边车，B-C单边车，C-A单边车 优化方案：将A-B、B-C、C-A的三辆单边车优化为一辆环形往返车；
 规则-3: A-B单边车，C-A单边车，B、C同省 优化方案：当B、C同省，将A-B、C-A两辆单边优化为一辆环形往返
 问题如下：
 以某快递公司的实际单边车数据为例（线路ID编码;出分拨中心; 出分拨中心所在省;到达分拨中心;到达分拨中心所在省；车型；），进行优化，
 优化的规则参照以上，并且优先级依次降低，合并的时候需要考虑车型（分为17.5m和9.6m两种）：1、相同车型才能进行合并；
 2、两辆同方向的9.6m可以与一辆17.5m的对开车型合并优化 说明：优化输出结果按照规则分类，例如rule1： 2016120001+2016120002表示将单边
 车线路ID编码为2016120001和2016120002按照规则1合并优化
 编译器版本: Java 1.8.0_66
 请使用标准输入输出(System.in, System.out)；已禁用图形、文件、网络、系统相关的操作，如java.lang.Process , javax.swing.JFrame ,
 Runtime.getRuntime；不要自定义包名称，否则会报错，即不要添加package answer之类的语句；您可以写很多个类，但是必须有一个类名为Main，
 并且为public属性，并且Main为唯一的public class，Main类的里面必须包含一个名字为'main'的静态方法（函数），这个方法是程序的入口
 时间限制: 3S (C/C++以外的语言为: 5 S)   内存限制: 128M (C/C++以外的语言为: 640 M)
 输入:
 线路数据，大于2行 每行由6列组成 线路ID;出发分拨中心名称;出发省名称;到达分拨中心名称;到达省名称;车型;
 输出:
 按照三个优化规则输出的单边车优化结果
 输入范例:
 350410;嘉兴中心;浙江省;西安中心;陕西省;9.6m;
 350424;西安中心;陕西省;嘉兴中心;浙江省;9.6m;
 350428;嘉兴中心;浙江省;长沙中心;湖南省;17.5m;
 350432;长沙中心;湖南省;武汉中心;湖北省;17.5m;
 350448;武汉中心;湖北省;嘉兴中心;浙江省;17.5m;
 350476;嘉兴中心;浙江省;潍坊中心;山东省;9.6m;
 350479;潍坊中心;山东省;嘉兴中心;浙江省;17.5m;
 350481;嘉兴中心;浙江省;成都中心;四川省;9.6m;
 输出范例:
 rule1:350410+350424
 rule2:350428+350432+350448

 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<UnilateralLine> lineList = new ArrayList<UnilateralLine>();
        while (scanner.hasNextLine())
        {
            String[] options = scanner.nextLine().split(";");
            if (options.length < 5)
            {
                break;
            }
            lineList.add(new UnilateralLine(options[0], options[1], options[2], options[3], options[4], options[5]));
        }
        scanner.close();

        // wirte your code here
        List<String> result = calculateUnilateral(lineList);

        for (String str : result)
        {
            System.out.println(str);
        }
    }
    public static List<String> calculateUnilateral(List<UnilateralLine> lineList)
    {
        List<String> result = new ArrayList<String>();
        for(int i=0;i<lineList.size();++i)
        {
            String sPro = lineList.get(i).getSPro();
            String sCen = lineList.get(i).getSCen();
            String ePro = lineList.get(i).getEPro();
            String eCen = lineList.get(i).getECen();
            String tType = lineList.get(i).getTType();
            String id = lineList.get(i).getId().trim();
            boolean flag = false;
            for(int j=i+1;j<lineList.size();++j) {
                if(tType.equalsIgnoreCase(lineList.get(j).getTType())&&ePro.equalsIgnoreCase(lineList.get(j).getSPro())&&eCen.equalsIgnoreCase(lineList.get(j).getSCen()))
                {
                    eCen = lineList.get(j).getECen();
                    ePro = lineList.get(j).getEPro();

                    id=id+ "+"+ lineList.get(j).getId().trim();
                    if(sPro.equalsIgnoreCase(lineList.get(j).getEPro())&&sCen.equalsIgnoreCase(eCen = lineList.get(j).getECen()))
                    {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag==true)
            {
                String rst = "rule"+ (result.size()+1)+ ":"+id;
                result.add(rst);
            }
        }
        return result;
    }
    public static class UnilateralLine {
        private String id;
        private String sCen;//出发分拨
        private String sPro;//出发省
        private String eCen;//到达分拨
        private String ePro;//到达省
        //9.6m/17.5m
        private String tType;//车型
        public UnilateralLine(String id, String sCen, String sPro, String eCen, String ePro, String tType) {
            this.id = id;this.sCen = sCen;this.sPro = sPro;this.eCen = eCen;this.ePro = ePro;this.tType = tType;}
        public String getId() {return id;}
        public void setId(String id) {this.id = id;}
        public String getSCen() {return sCen;}
        public void setSCen(String ePro) {this.ePro = ePro;}
        public String getSPro() {return sPro;}
        public void setSPro(String sPro) {this.sPro = sPro;}
        public String getECen() {return eCen;}
        public void setECen(String eCen) {this.eCen = eCen;}
        public String getEPro() {return ePro;}
        public void setEPro(String ePro) {this.ePro = ePro;}
        public String getTType() {return tType;}
        public void setTType(String tType) {this.tType = tType;}
    }
}
