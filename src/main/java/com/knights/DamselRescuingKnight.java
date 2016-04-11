package com.knights;

/**
 * Created by Thomas on 2016/4/11
 * 营救少女的骑士
 * 紧耦合，极大的限制了这个骑士执行探险的能力，只能营救少女
 * 而且编写单元测试十分的困难
 * 紧耦合有两面性
 */
public class DamselRescuingKnight implements Knight{
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        quest = new RescueDamselQuest();        //与RescueDamselQuest紧耦合
    }
    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
