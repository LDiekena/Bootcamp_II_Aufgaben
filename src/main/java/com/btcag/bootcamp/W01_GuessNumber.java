package com.btcag.bootcamp;

import java.util.Random;
import java.util.Scanner;

public class W01_GuessNumber {
    public static void main(String[] args) {
        //Eingabeaufforderung Zahlenraum
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe den Zahlenraum an, in welcher die Zufallszahl ausgewählt werden soll: ");
        long eingabeFuerZufallszahl = sc.nextLong();

        //Generierung einer Zufallszahl auf BAsis der Eingabe
        Random random = new Random();
        long rZahl = random.nextLong(eingabeFuerZufallszahl);

        //Eingabeaufforderung Zahl erraten
        System.out.println("1. Versuch: Geben Sie ihre Vermutung zwischen 0 und " +eingabeFuerZufallszahl +" ein:");
        long eingabe = sc.nextLong();

        //Abfrage Zahl noch nicht richtig erraten
        while (eingabe != rZahl) {
            int versuch = 1;
            //Abfrage gesuchte Zahl kleiner als Vermutung
            while (eingabe > rZahl) {
                versuch++;
                System.out.println(versuch + ". Versuch:" + "Die gesuchte Zahl ist kleiner als Ihre Zahl, bitte geben Sie " +
                        "eine kleinere Vermutung ab:");
                eingabe = sc.nextLong();
            }
            //Abfrage gesuchte Zahl größer als Vermutung
            while (eingabe < rZahl) {
                versuch++;
                System.out.println(versuch + ". Versuch:" + "Die gesuchte Zahl ist größer als Ihre Zahl, bitte geben Sie " +
                        "eine größere Vermutung ab ");
                eingabe = sc.nextLong();
            }
        }
        System.out.println("Sie haben die Zahl richtig erraten!");
    }
}
