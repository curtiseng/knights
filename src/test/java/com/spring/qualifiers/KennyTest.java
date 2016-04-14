package com.spring.qualifiers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Thomas on 2016/4/13.
 * Kenny排练
 */
public class KennyTest {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("qualifiers/spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("kenny");
        performer.perform();
    }
}
