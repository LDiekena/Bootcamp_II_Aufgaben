package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_CrypticNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl zum verschlüsseln ein:");
        double zahl = sc.nextDouble();

        double vZahl = zahl / 5 * 6;
        System.out.println("Die verschlüsselte Zahl ist: " + vZahl);

        System.out.println("Geben Sie ihre verschlüsselte Zahl ein um diese wieder zu entschlüsseln:");
        double veZahl = sc.nextDouble();

        double eZahl = veZahl * 5 / 6;
        System.out.println("Die vorherige Zahl war die: " + eZahl);
    }
}
