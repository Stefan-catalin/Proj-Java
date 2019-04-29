package com.credite;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //AICI SE VOR CREA TOTATE OBIECTELE
        //IAR SERVICIILE... VOI IMPLEMENTA CAND VOI STII CE SERVICII VREAU
        service S = new service();
        client C = new client();
        C = S.citire_client();
        S.printClient(C);
    }
}
