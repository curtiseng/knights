package com.spring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Thomas on 2016/4/17.
 * 测试魔术师截听志愿者内心的想法
 * Spring测试方法
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "/aop/spring-idol2.xml" })
public class MagicianTest {
    @Autowired
    MindReader magician;

    @Autowired
    @Qualifier("volunteer")
    Volunteer volunteer;

    @Test
    public void magician() {
        volunteer.thinkOfSomething("Queen of Hearts");

        assertEquals("Queen of Hearts",magician.getThoughts());
    }
}
