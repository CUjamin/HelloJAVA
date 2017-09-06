package cuj.question.zhongxing.question6;

/**
 * Created by cujamin on 2017/8/29.
 * 约翰错过他的公交汽车，他从家走到学校，
 * 家到学校之间的距离是D个单位，他初始有K各单位能量，1单位路程消耗1单位能量，
 * 家到学校路上有N个果汁摊，每个果汁摊可以补充特定数量果汁，1单位果汁增加1单位能量。
 *
 * 计算至少需要停下来补充能量的最小摊位数目。
 * 若不能到达学校，输出-1；
 *
 */
public class Main {
    public static void main(String[]args)
    {
        int[] juiceDis = {5,7,10};
        int[] juices = {2,3,5};
        System.out.println(canReach(3,juiceDis,juices,15,5));
    }
    public static int canReach(int n , int[] juiceDis,int[]juices,int dis,int initEnergy)
    {
        return canReach( 0,  n ,  juiceDis,juices, dis, initEnergy);
    }
    public static int canReach(int i , int n , int[] juiceDis,int[]juices,int dis,int initEnergy)
    {
        System.out.println("A:REACH : "+i+" ; Energy : "+initEnergy);
        int energy = initEnergy;
        if(energy>=dis)return 0;

        if(i>=n||energy<juiceDis[i])return -1;
        System.out.println("B:REACH : "+i+" ; Energy : "+energy);



        int resultA = canReach( i+1,  n ,  juiceDis , juices, dis, energy+juices[i]);
        int resultB = canReach( i+1,  n ,  juiceDis , juices, dis, energy);

        if(resultA<0&&resultB<0)return -1;
        else if(resultA>=0&&resultB>=0)
        {
            if(resultA<resultB)return resultA+1;
            else return resultB;
        }
        if(resultA>0)return resultA+1;
        else return resultB;

    }
}
