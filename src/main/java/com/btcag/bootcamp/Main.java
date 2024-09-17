package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Berechnung nach Eingabe im Terminal
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Zahl zur Quadratzahlberehunung eingeben:");
        long thenumber = sc.nextLong();
        thenumber *= thenumber; //äquivalent zu thenumber = thenumber * thenumber
        System.out.println("Ergebnis: " + thenumber);
        */

        //Berechnung von Dezimalzahl in Binärzahl mit Modulo 2
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte positive ganze Zahl zum Umrechnen eingeben: ");
        int dezimal = sc.nextInt();
        String res = "";

        while (dezimal>0) {
            int resModulo = dezimal % 2;
            dezimal = dezimal/2;
            res = resModulo + res;
        }
        System.out.print("Die eingegebene Zahl entspricht im Binärsystem den Wert: " + res);
        */

    }
}