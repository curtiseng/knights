package com.spring.aop;

/**
 * Created by Thomas on 2016/4/17.
 * 实现志愿者
 */
public class Volunteer implements Thinker {
    private String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
