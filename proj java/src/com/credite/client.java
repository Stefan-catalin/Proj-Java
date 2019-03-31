package com.credite;

public class client {
    private String NumeFamile;
    private String NumePers;
    private int varsta;
    private int cnp;
    private String adresa;
    private int numarTelefon;
    private credit NrPachet;

    public String getName1() {
        return NumeFamile;
    }
    public String getName2() {
        return NumePers;
    }
    public String getAdresa() {
        return adresa;
    }
    public int getVarsta() {
        return varsta;
    }
    public int getCNP() {
        return cnp;
    }
    public int getNumarTelefon() {
        return numarTelefon;
    }
    public credit getNrPachet() {
        return NrPachet;
    }
    public void setName1(String numeFamile) {
        NumeFamile=numeFamile;
    }
    public void setName2(String numeFamile) {
        NumePers = numeFamile;
    }
    public void setAdresa(String adr) {
        adresa = adr;
    }
    public void setVarsta(int var) {
        varsta = var;
    }
    public void setCNP(int var) {
        cnp = var;
    }
    public void setNumarTelefon(int var) {
        numarTelefon = var;
    }
    public void setNrPachet(credit Pac) {
        NrPachet = Pac;
    }


}