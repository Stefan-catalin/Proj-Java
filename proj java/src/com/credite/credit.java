package com.credite;

public class credit {
    private int initCash;
    private int endCash;
    private rate proc;
    private float plataLuna;

    public int getInitCash() {
        return initCash;
    }
    public int getEndCash() {
        return endCash;
    }
    public rate getRate() {
        return proc;
    }
    public float getPlataLuna() {
        return plataLuna;
    }

    public void setInitCash(int cash) {
        initCash = cash;
    }
    public void setEndCash(int cash) {
        endCash = cash;
    }
    public void setRate(rate R) {
        proc = R;
    }
    public void setPlataLuna(int cash) {
        plataLuna = cash;
    }
}
