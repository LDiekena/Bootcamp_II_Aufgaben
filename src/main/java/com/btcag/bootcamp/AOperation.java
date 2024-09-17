package com.btcag.bootcamp;

public class AOperation {
    public static void main(String[] args) {
        int wert = 0;
        int wert1 = wert++;
        int wert2 = ++wert;

        //Anfangswert direkt
        System.out.println(wert1);
        //Anfangswert von Beginn an höher
        System.out.println(wert2);
    }

}
