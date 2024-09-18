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

        System.out.println("Bitte gebe die Größe des Dreiecks an:");
        int groesseD = sc.nextInt();

        for (int i = 1; i <= groesseD; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }





    }
}
