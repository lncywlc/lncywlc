package com.lncywlc.rio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuliangchao
 * @create 2018-12-10 10:00
 */
@RestController
public class hello {
    @RequestMapping(value ="/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello SpringBoot!";
    }
}
