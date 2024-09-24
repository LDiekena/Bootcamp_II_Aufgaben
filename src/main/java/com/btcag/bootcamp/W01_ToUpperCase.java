package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_ToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gib einen kleingeschriebenen Satz ein, welcher in große Buchstaben umgewandelt werden" +
                "soll:");
        String text = sc.nextLine();

        int zaehler = 0;
        String res = "";

        while (zaehler < text.length()) {
            int low = text.charAt(zaehler);
            char up = (char)(low-32);
            res = res + up;
            zaehler++;
        }
        System.out.print(res);
    }
}
