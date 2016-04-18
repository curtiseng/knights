package com.spring.aop;

/**
 * Created by Thomas on 2016/4/16.
 * 读心者:截听志愿者的内心感应和显示他们在想什么
 */
public interface MindReader {
    void interceptThoughts(String thoughts);

    String getThoughts();
}
