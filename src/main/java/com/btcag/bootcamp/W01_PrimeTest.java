package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_PrimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl ein die du testen möchtest:");
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
                System.out.println("Die Zahl " + zahl + " ist keine Primzahl!");
            } else if (zaehler == 2) {
                zaehler = 1;
                System.out.println("Die Zahl " + zahl + " ist eine Primzahl!");
            }
        }


    }
}
