package cuj.anything.util;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by cujamin on 2018/9/1.
 * 工具类 避免public构造器
 */
public class DateUtil {
    private DateUtil() {}
    public static Date todayDate()
    {
        return new Date();
    }
}
