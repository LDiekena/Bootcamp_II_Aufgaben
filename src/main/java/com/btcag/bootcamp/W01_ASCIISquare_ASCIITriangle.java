package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_ASCIISquare_ASCIITriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe die Größe des Vierecks an:");
        int groesseV = sc.nextInt();
        int spalten = groesseV - 1;
        int zeilen = groesseV;

        //Viereck
        while (spalten >= 0) {
            int i = zeilen;
            while (i > 0) {
                System.out.print('*');
                i--;
            }
            spalten--;
            System.out.println('*');

        }

        System.out.println("Bitte gebe die Größe des umgekehrten Dreiecks an:");
        int groesseD = sc.nextInt();
        int spaltenD = groesseD - 1;
        int zeilenD = groesseD - 1;

        //Umgekehrtes Dreieck
        while (spaltenD >= 0) {
            int i = zeilenD;
            while (i > 0) {
                System.out.print('*');
                i--;
            }
            zeilenD--;
            System.out.println('*');
            spaltenD--;
        }

        /*
        System.out.println("Bitte gebe die Größe des Dreiecks an:");
        int groesseD2 = sc.nextInt();
         */



    }
}
