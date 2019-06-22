package cuj.anything.log;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Auther: cujamin
 * @Date: 2019/3/20 11:10
 * @Description:
 */
public class LocationTest {

    @Test
    public void getInfo()  {
        Location l = new Location();
        l.getInfo();
        System.out.println(l.getClass().getName());
    }
}