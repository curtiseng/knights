package com.spring.qualifiers;

/**
 * Created by Thomas on 2016/4/11.
 * 杂耍
 */
public class Juggler implements Performer{
    private int beanBags = 3;

    public Juggler() {

    }

    public Juggler(int beanBags) {
        this();     //复习重叠构造器，可以去掉
        this.beanBags = beanBags;
    }

    public void perform() throws PerformanceException {
        System.out.println("JUGGLING "+ beanBags + " BEANBAGS");
    }
}
