package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Thomas on 2016/4/15.
 * 观众
 */
public class Audience {
    //表演之前
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }

    //表演之前
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }

    //表演之后
    public void applaud() {
        System.out.println("ClAP CLAP CLAP CLAP");
    }

    //表演失败之后
    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }

    //环绕通知
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis();

            //执行被通知方法，可以多次执行，也可以不执行
            joinPoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP");
            System.out.println("The performance took" + (end-start) + "milliseconds");
        } catch (Throwable t) {
            System.out.println("Boo! We want our money back!");
        }
    }
}
