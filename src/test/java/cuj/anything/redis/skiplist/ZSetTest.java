package cuj.anything.redis.skiplist;

import org.junit.Test;

/**
 * @Auther: cujamin
 * @Date: 2019/3/7 17:43
 * @Description:
 */
public class ZSetTest {

    @Test
    public void zslRandomLevel() {

        int trytimes = 10000;
        int[] resset = new int[33];
        resset[0]=trytimes;

        double percent = 0.0;

        for(int i = 0; i < trytimes; i++){
            resset[ZSet.zslRandomLevel()]++;
        }

        for(int i = 1; i <= 32; i++){
            if(resset[i-1] == 0){
                percent = 0.0;
            }else{
                percent = (double)resset[i]/resset[i-1];
            }
            System.out.println("resset["+i+"] is "+resset[i]+", percentage of resset["+(i-1)+"] is "+percent);
        }
    }
}