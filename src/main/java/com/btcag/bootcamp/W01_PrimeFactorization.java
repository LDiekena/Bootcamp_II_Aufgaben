package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl ein die du testen möchtest. Sollte diese Zahl keine Primzahl sein so" +
                "wird diese in ihre Primfaktoren zerlegt:");
        int zahl = sc.nextInt();
        int teiler = zahl - 1;
        int zaehler = zahl - 1;

        while (zaehler > 1) {
            int res = zahl % teiler;
            teiler--;
            zaehler--;

            if (res == 0) {
                zaehler = 0;
                res = 1;
                System.out.println("Die Zahl " + zahl + " ist keine Primzahl und wird in folgende Faktoren zerlegt: ");
                // TODO: Zerlegung
            } else if (zaehler == 2) {
                zaehler = 1;
                System.out.println("Die Zahl " + zahl + " ist eine Primzahl und muss daher nicht zerlegt werden!");
            }
        }
    }
}
