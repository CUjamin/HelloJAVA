import com.alibaba.fastjson.JSON;

/**
 * @Auther: cujamin
 * @Date: 2019/6/10 10:33
 * @Description:
 */
public class FastjsonTest {

    //        public static String userStr="{\"@type\":\"User\",\"name\":\"myname\"}";
//    public static String userStr2="{\"@type\":\"com.alibaba.fastjson.util.ASMClassLoader\",\"defaultAssertionStatus\":true}";
    public static String userStr="{\"@type\":\"User2\",\"name\":\"出现漏洞\"}";

    public static void main(String[] args) {
        try{
            System.out.println("test 1");
            User user1 = (User) JSON.parse(userStr);
            System.err.println(user1.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            System.out.println("test 2");
            User user2 = JSON.parseObject(userStr,User.class);
            System.err.println(user2.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
class User{
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class User2{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("漏洞:"+name);
    }
}
