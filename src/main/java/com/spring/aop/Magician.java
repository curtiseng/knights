package com.spring.aop;

/**
 * Created by Thomas on 2016/4/17.
 * 魔术师
 */
public class Magician implements MindReader{
    private String thoughts;

    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
