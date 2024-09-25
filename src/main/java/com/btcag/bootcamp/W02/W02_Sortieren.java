package com.btcag.bootcamp.W02;

import java.util.Arrays;
import java.util.Scanner;

public class W02_Sortieren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe die länge der benötigten Liste ein: ");
        int leangeArray = sc.nextInt();

        System.out.println("Bitte nacheinander " + leangeArray + " Zahlen ein die in ein Array geschrieben werden sollen: ");
        int[] unsortierteWerte = new int[leangeArray];
        int eingabeZaehler = 0;

        while (unsortierteWerte.length > eingabeZaehler) {
            int eingabe = sc.nextInt();
            unsortierteWerte[eingabeZaehler] = eingabe;
            eingabeZaehler++;
        }

        // Methodenaufruf
        sorting(unsortierteWerte);
        System.out.println(Arrays.toString(unsortierteWerte));

        // Sortierung mit vorhandenem Sort
        /*
        System.out.println(Arrays.toString(unsortierteWerte));
        Arrays.sort(unsortierteWerte);
        System.out.println(Arrays.toString(unsortierteWerte));
        */

    }

    //Bubblesort Methode
    public static int[] sorting (int[] unsortierteWerte) {
        int cache = 0;
        for (int i = 1; i < unsortierteWerte.length; i++) {
            for (int j = 0; j < unsortierteWerte.length - i; j++) {
                if (unsortierteWerte[j] > unsortierteWerte[j + 1]) {
                    cache = unsortierteWerte[j];
                    unsortierteWerte[j] = unsortierteWerte[j + 1];
                    unsortierteWerte[j + 1] = cache;
                }
            }
        }
        return unsortierteWerte;
    }
}
