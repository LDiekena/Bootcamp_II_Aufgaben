package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_Crosssum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long gZahl = sc.nextLong();
        long quersumme = 0;

        while (gZahl != 0) {
            quersumme = quersumme + gZahl%10;
            gZahl = gZahl/10;
        }
        System.out.println(quersumme);

        String zKette = sc.nextLine();
    }
}
