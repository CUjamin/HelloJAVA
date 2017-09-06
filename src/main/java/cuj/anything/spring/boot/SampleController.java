package cuj.anything.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cujamin on 2017/8/24.
 */
@Controller
public class SampleController {
    @RequestMapping("/home")
    @ResponseBody
    String home() {

        return "name = Hello World!";
    }
}
