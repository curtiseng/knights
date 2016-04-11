package com.knights;

/**
 * Created by Thomas on 2016/4/11.
 * 勇敢的骑士
 * 足够灵活的骑士
 * 构造器注入他需要解决的问题
 */
public class BraveKnight implements Knight{
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
