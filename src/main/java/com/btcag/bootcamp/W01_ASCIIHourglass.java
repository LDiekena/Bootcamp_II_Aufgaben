package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_ASCIIHourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe die Größe der Sanduhr an:");
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

       //unteres Dreieck
        for (int i = 1; i <= groesseD; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }
}
