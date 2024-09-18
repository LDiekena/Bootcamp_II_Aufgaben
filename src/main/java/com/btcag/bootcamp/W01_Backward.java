package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_Backward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl (String) ein die du umdrehen möchtest:");
        String zKette = sc.nextLine();
        String resZKette = "";

        for (int i = zKette.length()-1; i >=0; i--) {
            resZKette = resZKette + zKette.charAt(i);
        }
        System.out.println(resZKette);

        /*
        System.out.println("Bitte gebe eine Zahl (Long) ein die du umdrehen möchtest:");
        long gZahl = sc.nextLong();
        long resGZahl = 0;

        while (gZahl>0) {
            gZahl--;
            resGZahl = gZahl + resGZahl;
        }
        System.out.println(resGZahl);
        */

    }
}
