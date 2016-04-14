package com.spring.qualifiers;

/**
 * Created by Thomas on 2016/4/13.
 * 乐器演奏家
 */
public class Instrumentalist implements Performer{
    public Instrumentalist() {

    }
    public void perform() throws PerformanceException {
     System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }
    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }


}
