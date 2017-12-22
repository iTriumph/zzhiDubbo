package zzhiDubboconsumer.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import zzhiDubboapi.po.People;
import zzhiDubboapi.service.PeopleService;

/**
 * Created by zhangzhii on 2017/12/15.
 */
@RestController
@RequestMapping(value="/people")
public class PeopleController {

    private static final Logger log = LoggerFactory.getLogger(PeopleController.class);

    @Autowired
    private PeopleService peopleService;

    @ApiOperation(value="获取用户信息", notes="")
    @RequestMapping(value={""}, method=RequestMethod.GET)
    public People getPeople() {
        return peopleService.findPeople();
    }



}
