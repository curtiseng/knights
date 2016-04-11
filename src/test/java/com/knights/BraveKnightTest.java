package com.knights;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by Thomas on 2016/4/11.
 * Mockito框架测试BraveKnight
 * 现在BraveKnight类可以接受传给它的任意一种Quest的实现
 * 但如何把特定的Query实现传给他？
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() throws QuestException{
        Quest mockQuest = mock(Quest.class);    //创建虚拟的假的（mock）Quest；

        BraveKnight knight = new BraveKnight(mockQuest);    //注入假的（mock）Quest；
        knight.embarkOnQuest();

        verify(mockQuest,times(1)).embark();
    }
}
