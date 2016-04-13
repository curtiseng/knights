package com.spring.qualifiers;

/**
 * Created by Thomas on 2016/4/13.
 *
 */
public class Stage {
    private Stage() {

    }
    //延时加载实例
    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }
    //返回实例
    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
