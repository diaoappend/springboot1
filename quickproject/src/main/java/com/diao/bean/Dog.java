package com.diao.bean;

import org.springframework.stereotype.Component;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/25 15:28
 * @description:
 * @version: 1.0
 */
@Component
public class Dog {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
