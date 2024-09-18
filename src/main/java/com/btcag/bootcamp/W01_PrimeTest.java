package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_PrimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl ein die du testen möchtest:");
        int zahl = sc.nextInt();

        if (zahl >= 1) {
            if (zahl/zahl == 1 && zahl%2 > 0) { //Abfrage noch nicht Korrekt
                System.out.println("Die Zahl " + zahl + " ist eine Primzahl");
            } else {
                System.out.println("Die Zahl " + zahl + " ist keine Primzahl.");
            }
        } else {
            System.out.println("Die Zahl " + zahl + " ist nicht größer als 1");
        }
    }
}
