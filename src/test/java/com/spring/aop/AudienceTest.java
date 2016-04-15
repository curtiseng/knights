package com.spring.aop;

import com.spring.qualifiers.PerformanceException;
import com.spring.qualifiers.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Thomas on 2016/4/15.
 * 观众测试类
 */
public class AudienceTest {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop/spring-idol2.xml","qualifiers/spring-idol.xml");

        //只有加载了包含该Bean的配置文件，才能得到这个Bean
        Performer performer = (Performer) ctx.getBean("kenny");
        performer.perform();
    }
}
