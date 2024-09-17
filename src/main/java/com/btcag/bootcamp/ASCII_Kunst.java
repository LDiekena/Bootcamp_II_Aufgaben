package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII_Kunst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe die Größe des Vierecks an:");
        int groesseV = sc.nextInt();
        int spalten = groesseV;
        int zeilen = groesseV;

        while (spalten > 0) {
            System.out.print("*");
            spalten--;
        }

        while (zeilen > 0) {
            System.out.println("*");
            zeilen--;
        }
    }
}
