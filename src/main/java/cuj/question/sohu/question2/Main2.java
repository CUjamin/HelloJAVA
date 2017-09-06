package cuj.question.sohu.question2;

import java.util.*;

/**
 * Created by cujamin on 2017/8/28.
 */
public class Main2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            flag=false;
            int[] num = new int[6];
            for(int i=0;i<6;i++){
                num[i]=scanner.nextInt();
            }
            for(int i=0;i<6;i++){
                if(num[i]!=0){
                    flag=true;
                    break;
                }
            }

            int totle = num[5]+num[4]+num[3];
            if(num[2]%4==0) totle = totle+num[2]/4;
            else totle = totle+num[2]/4+1;

            int stay3 = 4-num[3]%4;
            int take2 = 0;
            if(stay3==1) take2=1;
            if(stay3==2) take2=3;
            if(stay3==3) take2=5;
            int stay2 = num[1]-5*num[3]-take2;
            if(stay2>0) {
                if(num[1]%9==0) totle = totle+num[1]/9;
                else totle = totle+num[1]/9+1;
            }
            int area = totle*36-num[5]*36-num[4]*25-num[3]*16-num[2]*9-num[1]*4;
            int need = num[0]-area;
            if(need>0){
                totle=totle+need/36+1;
            }
            if(flag) System.out.println(totle);
        }

    }
}
