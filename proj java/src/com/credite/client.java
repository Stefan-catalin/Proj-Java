package com.credite;

public class client extends credit{
    private String NumeFamile;
    private String NumePers;
    private int varsta;
    private int cnp;
    private String adresa;
    private int numarTelefon;

    client(){
        NumeFamile="?";
        NumePers="?";
        varsta=0;
        cnp=0;
        adresa="?";
        numarTelefon=0;
    }
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


}