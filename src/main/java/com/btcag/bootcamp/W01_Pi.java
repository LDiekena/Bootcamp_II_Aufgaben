package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_Pi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib die Anzahl der Iterationen zur Annäherung von Pi ein: ");

        int iteration = sc.nextInt();
        double res = 0.0;
        int zaehler = 0;

        while (zaehler < iteration) {
            double formel = 4.0 / (2 * zaehler + 1);
            res = res + (1 - 2 * (zaehler % 2)) * formel;
            zaehler++;
        }
        System.out.println("Nach den " + iteration + " Iterationen wird Pi auf den Wert " + res + " angenähert.");
    }
}
