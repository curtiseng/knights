package com.knights;

/**
 * Created by Thomas on 2016/4/11.
 * 勇敢的骑士
 * 足够灵活的骑士
 * 构造器注入他需要解决的问题
 */
public class BraveKnight implements Knight{
    private Quest quest;
    //private Minstrel minstrel;  //呤游诗人

    public BraveKnight(Quest quest/*, Minstrel minstrel*/) {
        this.quest = quest;
        //this.minstrel = minstrel;
    }


    public void embarkOnQuest() throws QuestException {
        //minstrel.singBeforeQuest(); //Knight应该管理它的Minstrel吗？
        quest.embark();
        //minstrel.singAfterQuest();
    }
}
