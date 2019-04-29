package com.credite;

import java.io.File;
import java.util.Scanner;

public class service {
    //PE SCURT AICI VOI PUNE NISTE METODE DE ACCES RAPID LA INFORMATII DIN SISTEMUL PE CARE IL FAC
    //EX: NUME CLIENT - RATA LUNARA - NR LUNI RAMASE - TOTAL PLATA RAMAS
    //CA CE S-AR PUTEA ARATA CAND UN ADMIN VREA SA OBTINA INFORMATII RAPID; NEW IDEAS TBA
    public Pensionar citire_clientP(){
        Pensionar C = new Pensionar();
        client aux = citire_client();

        C.setName1(aux.getName1());
        C.setName2(aux.getName2());
        C.setAdresa(aux.getAdresa());
        C.setVarsta(aux.getVarsta());
        C.setCNP(aux.getCNP());
        C.setNumarTelefon(aux.getNumarTelefon());
        C.setNrLuni(aux.getNrLuni());
        C.setPlataLuna(aux.getPlataLuna());

        C.setPlataLuna(C.getPlataLuna() * (float)C.getDiscount());
        C.setEndCash(C.getInitCash() + (int)C.getPlataLuna() * C.getNrLuni());

        return C;
    }
    public void printPensionar(Pensionar S){
        System.out.println("\n\nPENSIONAR");
        printClient(S);
    }

    public Handicap citire_clientH(){
        Handicap C = new Handicap();
        client aux = citire_client();

        C.setName1(aux.getName1());
        C.setName2(aux.getName2());
        C.setAdresa(aux.getAdresa());
        C.setVarsta(aux.getVarsta());
        C.setCNP(aux.getCNP());
        C.setNumarTelefon(aux.getNumarTelefon());
        C.setNrLuni(aux.getNrLuni());
        C.setPlataLuna(aux.getPlataLuna());

        C.setPlataLuna(C.getPlataLuna() * (float)C.getDiscount());
        C.setEndCash(C.getInitCash() + (int)C.getPlataLuna() * C.getNrLuni());

        return C;
    }
    public void printHandicap(Handicap S){
        System.out.println("\n\nHANDICAP");
        printClient(S);
    }

    public Student citire_clientS(){
        Student C = new Student();
        client aux = citire_client();

        C.setName1(aux.getName1());
        C.setName2(aux.getName2());
        C.setAdresa(aux.getAdresa());
        C.setVarsta(aux.getVarsta());
        C.setCNP(aux.getCNP());
        C.setNumarTelefon(aux.getNumarTelefon());
        C.setNrLuni(aux.getNrLuni());
        C.setPlataLuna(aux.getPlataLuna());

        C.setPlataLuna(C.getPlataLuna() * (float)C.getDiscount());
        C.setEndCash(C.getInitCash() + (int)C.getPlataLuna() * C.getNrLuni());

        return C;
    }
    public void printStudent(Student S){
        System.out.println("\n\nSTUDENT");
        printClient(S);
    }

    public Ipotecar citire_clientI(){
        Ipotecar C = new Ipotecar();
        client aux = citire_client();

        C.setName1(aux.getName1());
        C.setName2(aux.getName2());
        C.setAdresa(aux.getAdresa());
        C.setVarsta(aux.getVarsta());
        C.setCNP(aux.getCNP());
        C.setNumarTelefon(aux.getNumarTelefon());
        C.setNrLuni(aux.getNrLuni());
        C.setPlataLuna(aux.getPlataLuna());

        C.setPlataLuna(C.getPlataLuna() * (float)C.getDiscount());
        C.setEndCash(C.getInitCash() + (int)C.getPlataLuna() * C.getNrLuni());

        return C;
    }
    public void printIpotecar(Ipotecar S){
        System.out.println("\n\nIPOTECAR");
        printClient(S);
    }

    public Personal citire_clientPs(){
        Personal C = new Personal();
        client aux = citire_client();

        C.setName1(aux.getName1());
        C.setName2(aux.getName2());
        C.setAdresa(aux.getAdresa());
        C.setVarsta(aux.getVarsta());
        C.setCNP(aux.getCNP());
        C.setNumarTelefon(aux.getNumarTelefon());
        C.setNrLuni(aux.getNrLuni());
        C.setPlataLuna(aux.getPlataLuna());

        C.setPlataLuna(C.getPlataLuna() * (float)C.getDiscount());
        C.setEndCash(C.getInitCash() + (int)C.getPlataLuna() * C.getNrLuni());

        return C;
    }
    public void printPersonal(Personal S){
        System.out.println("\n\nPERSONAL");
        printClient(S);
    }





    public client citire_client(){
        client nou = new client();

        File f = new File("C:\\WPLAGUE NR 8\\proj java\\DateImprumuturi.xlsx");
        Scanner sc = new Scanner(f);
        credit c = citire_credit(f);
        nou.setInitCash(c.getInitCash());
        nou.setEndCash(c.getEndCash());

        System.out.println("NUME : ");
        nou.setName1(sc.nextLine());

        System.out.println("PRENUME : ");
        nou.setName2(sc.nextLine());

        System.out.println("ADRESA : ");
        nou.setAdresa(sc.nextLine());

        System.out.println("VARSTA : ");
        nou.setVarsta(sc.nextInt());

        System.out.println("CNP : ");
        nou.setCNP(sc.nextInt());

        System.out.println("NR TELEFON : ");
        nou.setNumarTelefon(sc.nextInt());

        return nou;
    }
    public void printClient(client C){
        System.out.println("\nNUME : " + C.getName1());
        System.out.println("\nPRENUME : " + C.getName2());
        System.out.println("\nADRESA : " + C.getAdresa());
        System.out.println("\nVARSTA : " + C.getVarsta());
        System.out.println("\nCNP : " + C.getCNP());
        System.out.println("\nNR TELEFON : " + C.getNumarTelefon());
        printCredit(C);
    }
    public credit citire_credit(File f){
        credit c = new credit();
        Scanner sc = new Scanner(f);

        rate r = citire_rate(f);
        c.setRataLunara(r.getRataLunara());
        c.setNrLuni(r.getNrLuni());


        System.out.println("CASH INITIAL: ");
        c.setInitCash(sc.nextInt());

        float plata;
        plata = (float)c.getInitCash()/c.getNrLuni() + c.getRataLunara();
        c.setPlataLuna(plata);
        System.out.println("\nPLATA LUNARA : " + plata);

        return c;
    }
    public void printCredit(credit C){
        System.out.println("\nCASH INITIAL : " + C.getInitCash());
        System.out.println("\nPLATA LUNARA : " + C.getPlataLuna());
        System.out.println("\nCASH FINAL : " + C.getEndCash());
        printRate(C);
    }
    public rate citire_rate(File f){
        rate R = new rate();
        Scanner sc = new Scanner(f);

        System.out.println("RATA LUNARA: ");
        R.setRataLunara(sc.nextFloat());

        System.out.println("NR LUNI: ");
        R.setNrLuni(sc.nextInt());

        return R;
    }
    public void printRate(rate C){
        System.out.println("RATA LUNARA: " + C.getRataLunara());
        System.out.println("NR LUNI: " + C.getNrLuni());
    }


}
