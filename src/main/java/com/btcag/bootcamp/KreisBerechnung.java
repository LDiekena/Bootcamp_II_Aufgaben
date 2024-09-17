package com.btcag.bootcamp;

import java.util.Scanner;

public class KreisBerechnung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Radius für den zu berechnenden Kreis ein:");
        double radius = sc.nextDouble();
        double flaeche = radius * (3.14159265359 * 3.14159265359);

        System.out.println("Die Fläche für einen Kreis mit dem Radius " + radius + " beträgt " + flaeche);

        System.out.println("Bitte geben Sie die Länge für das zu berechnende Rechteck ein:");
        double laenge = sc.nextDouble();

        System.out.println("Bitte geben Sie die Breite für das zu berechnende Rechteck ein:");
        double breite = sc.nextDouble();

        double flaecheR = laenge * breite;

        System.out.println("Die Fläche des Rechtecks mit einer Länge von " + laenge + " und einer Breite von " + breite + " beträgt " + flaecheR);



    }
}
