package com.spring.qualifiers;

import java.util.Collection;

/**
 * Created by Thomas on 2016/4/14.
 * 一个人的乐队
 */
public class OneManBand implements Performer {
    public OneManBand() {

    }

    public void perform() throws PerformanceException {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;         //注入instruments集合
    }
}
