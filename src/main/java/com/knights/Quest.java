package com.knights;

/**
 * Created by Thomas on 2016/4/11.
 * 所有探险任务都需要实现的接口
 */
public interface Quest {

    void embark() throws QuestException;
}
