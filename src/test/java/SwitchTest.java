import org.junit.Test;

/**
 * @Auther: cujamin
 * @Date: 2019/3/7 17:02
 * @Description:
 */
public class SwitchTest {
    @Test
    public void switchTest(){
        int key =1;
        switch (key){
            case 1:{
                System.out.println(1);
            }
            case 2:{
                System.out.println(2);
            }
        }
    }
}
