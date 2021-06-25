package com.ph.springbootinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-init
 * @description:
 * @author: panhao
 * @date: 2021-06-25 21:39
 **/
@RestController
public class HelloController {
    @Value("${name}")
    private String name;

    @Value("${person.name}")
    private String name2;

    @Value("${person.age}")
    private String age;


    @Value("${address[0]}")
    private String address;

    @Value("${msg1}")
    private String msg1;
    @Value("${msg2}")
    private String msg2;

    @Autowired
    private Environment env;

    @Autowired
    private Person person;

    @RequestMapping("/hello6")
    public String hello6(){
        System.out.println(env.getProperty("name"));
        System.out.println(env.getProperty("person.name"));
        System.out.println(env.getProperty("msg1"));
        System.out.println("-------------");
        System.out.println(person.toString());
        return "hello spring boot 222";
    }

    @RequestMapping("/hello5")
    public String hello5(){
        System.out.println(msg1+'\n'+msg2);
        return "hello spring boot 222";
    }



    @RequestMapping("/hello4")
    public String hello4(){
        System.out.println(address);
        return "hello spring boot 222";
    }

    @RequestMapping("/hello3")
    public String hello3(){
        System.out.println(name2+age);
        return "hello spring boot 222";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println(name);
        return "hello spring boot 222";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot 222";
    }
}
