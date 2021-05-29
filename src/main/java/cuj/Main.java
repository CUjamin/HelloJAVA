package cuj;

// import java.util.HashMap;
// import java.util.Map;

/**
 * Created by cujamin on 2018/4/19.
 */
public class Main {
    public static void main(String[] args) {
//        Map<String , String> key =new HashMap<String, String>();
//        key.put("k1","v1");
//        key.put("k2","v2");
//        key.put("k3","v3");
//        System.out.println(key);


//        int num = 50;
//        num = num++ *2;
//        System.out.println(num);
//        float f = 1;

//        int i = 1;
//        int j = i++;
//        if((i==(++j))&&((i++)==j)){
//            i+=j;
//        }
//        System.out.println(i);
//        String s ="";
//        for(int x = 0;x<5;x++){
//            s+=x;
//        }
//        System.out.println(s);
//
//        boolean flag = 10%2==1&&10/3==0&&1/0==0;
//        System.out.println(flag?"m":"y");

//        long i = 2147483647;
//        i+=2L;
//        System.out.println(i);
//        System.out.println((char)(68));

        System.out.println(incr(10)+incr(8)+incr(-10));

    }
    public static int incr(int temp){
        if(temp>0){
            return temp*2;
        }
        // Map<String,String> map = new HashMap<String,String>();
        return -1;
    }
}
