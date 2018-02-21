package com.lh;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CHLaih on 2018/2/21.
 */
@RestController
public class helloWorld {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloWorld(){
        return "SpringBoot";
    }
}
