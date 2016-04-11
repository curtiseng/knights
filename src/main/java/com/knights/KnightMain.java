package com.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Thomas on 2016/4/11.
 * main()方法调用ClassPathXmlApplicationContext加载knights.xml,
 * 并获得Knight对象的引用
 */
public class KnightMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        /**
         * Knight类完全不知道我们的骑士接受哪种探险任务，而且完全没有意识到
         * 这是有BraveKnight来执行的。只有knights.xml文件知道哪个骑士执行了哪种探险任务
         */
        Knight knight = (Knight) context.getBean("knight");     //这里实现是BraveKnight

        knight.embarkOnQuest();
    }
}
