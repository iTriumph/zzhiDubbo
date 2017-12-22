package zzhiDubboconsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import zzhiDubboapi.po.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zhangzhii on 2017/12/22.
 */
@RestController()
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/index")
    @ResponseBody
    public String Home() {
        logger.info("home/index 开始");
        return "hello world 111";

    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(String name) {
        return name;

    }
    @RequestMapping(
            method= RequestMethod.POST,
            value="/test2")
    @ResponseBody
    public String  test2(@RequestBody User user, String name) {

        return user.toString();
    }


    @RequestMapping(
            method=RequestMethod.POST,
            value="/test3")
    @ResponseBody
    public String  test3(@RequestBody List<User> users, String name) {

        return Integer.toString( users.size());
    }


}