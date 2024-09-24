package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_Supermarket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe alle Produkte in Eurobeträgen ein, die der Kunde erwerben möchte. Um die Eingabe zu " +
                "beenden gebe bitte eine 0 ein.");
        double eingabe = sc.nextDouble();
        double res = 0.0;

        //Solange die Eingabe nicht mit 0 gestoppt wird werden weitere Preise erwartet
        while (eingabe > 0) {
            res = res + eingabe; //Summe aller Preise
            eingabe = sc.nextDouble();
        }

        System.out.println("Die Summe aller Produkte beträgt: " + res + " €");
        System.out.println("Bitte gebe die Summe ein die der Kunden übergeben hat.");
        double kundenEingabe = sc.nextDouble();

        while (kundenEingabe > 0) {
            // Abfrage ob übergebenes Geld überhaupt ausreichend ist
            if (kundenEingabe < res) {
                System.out.println("Der Kunde hat zu wenig Geld übergeben, bitte korrigieren Sie den Betrag:");
                kundenEingabe = sc.nextDouble();
            // Abfrage Kunde bezahlt genau und bekommt kein Rückgeld
            } else if (kundenEingabe == res){
                kundenEingabe = 0;
                System.out.println("Der Kunde hat den genauen Betrag gezahlt und bekommt daher kein Geld zurück!");
            //Kunde bezahlt mehr als benötigt und Rückgeld wird berechnet
            } else {
                double rueckgeld = kundenEingabe - res;
                System.out.println("Der Kunde bekommt " + rueckgeld + " € zurück. Bitte gebe folgende Scheine und Münzen zurück:");
                kundenEingabe = 0;

                while (rueckgeld > 0) {
                    if (rueckgeld - 200 >= 0) {
                        int schein200 = 0;
                        schein200++;
                        System.out.println(schein200 + " x 200 € Schein");
                        rueckgeld = rueckgeld - 200;
                    } else if (rueckgeld >= 100) {
                        int schein100 = 0;
                        schein100++;
                        System.out.println(schein100 + " x 100 € Schein");
                        rueckgeld = rueckgeld - 100;
                    } else if (rueckgeld >= 50) {
                        int schein50 = 0;
                        schein50++;
                        System.out.println(schein50 + " x 50 € Schein");
                        rueckgeld = rueckgeld - 50;
                    } else if (rueckgeld >= 20) {
                        int schein20 = 0;
                        schein20++;
                        System.out.println(schein20 + " x 20 € Schein");
                        rueckgeld = rueckgeld - 20;
                    } else if (rueckgeld >= 10) {
                        int schein10 = 0;
                        schein10++;
                        System.out.println(schein10 + " x 10 € Schein");
                        rueckgeld = rueckgeld - 10;
                    } else if (rueckgeld >= 5) {
                        int schein5 = 0;
                        schein5++;
                        System.out.println(schein5 + " x 5 € Schein");
                        rueckgeld = rueckgeld - 5;
                    } else if (rueckgeld >= 2) {
                        int muenze2 = 0;
                        muenze2++;
                        System.out.println(muenze2 + " x 2 € Münze");
                        rueckgeld = rueckgeld - 2;
                    } else if (rueckgeld >= 1) {
                        int muenze1 = 0;
                        muenze1++;
                        System.out.println(muenze1 + " x 1 € Münze");
                        rueckgeld = rueckgeld - 1;
                    } else if (rueckgeld >= 0.5) {
                        int muenze50 = 0;
                        muenze50++;
                        System.out.println(muenze50 + " x 50 Cent Münze");
                        rueckgeld = rueckgeld - 0.5;
                    } else if (rueckgeld >= 0.2) {
                        int muenze20 = 0;
                        muenze20++;
                        System.out.println(muenze20 + " x 20 Cent Münze");
                        rueckgeld = rueckgeld - 0.2;
                    } else if (rueckgeld >= 0.1) {
                        int muenze10 = 0;
                        muenze10++;
                        System.out.println(muenze10 + " x 10 Cent Münze");
                        rueckgeld = rueckgeld - 0.1;
                    } else if (rueckgeld >= 0.05) {
                        int muenze5 = 0;
                        muenze5++;
                        System.out.println(muenze5 + " x 5 Cent Münze");
                        rueckgeld = rueckgeld - 0.05;
                    } else if (rueckgeld >= 0.02) {
                        int muenze02 = 0;
                        muenze02++;
                        System.out.println(muenze02 + " x 2 Cent Münze");
                        rueckgeld = rueckgeld - 0.02;
                    } else if (rueckgeld >= 0.01) {
                        int muenze01 = 0;
                        muenze01++;
                        System.out.println(muenze01 + " x 1 Cent Münze");
                        rueckgeld = rueckgeld - 0.01;
                    } else {

                    }
                }
            }
        }
        System.out.println("Einen schönen Tag!");
    }
}
