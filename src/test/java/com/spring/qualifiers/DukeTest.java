package com.spring.qualifiers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Thomas on 2016/4/12.
 * Duck排练
 */
public class DukeTest {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("qualifiers/spring-idol.xml");

        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();
    }
}
