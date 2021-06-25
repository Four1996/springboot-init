package com.ph.springbootinit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @program: springboot-init
 * @description:
 * @author: panhao
 * @date: 2021-06-25 22:30
 **/
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private int age;
    private String[] address;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + Arrays.toString(address) +
                '}';
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
