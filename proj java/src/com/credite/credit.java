package com.credite;

public class credit extends rate {
    private int initCash;
    private int endCash;
    private float plataLuna;

    credit(){
        int initCash = 0;
        int endCash = 0;
        float plataLuna = 0;
    }
    public int getInitCash() {
        return initCash;
    }
    public int getEndCash() {
        return endCash;
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
    public void setPlataLuna(float cash) {
        plataLuna = cash;
    }
}
