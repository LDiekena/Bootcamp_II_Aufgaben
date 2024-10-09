package com.btcag.bootcamp.W02;

import java.util.Scanner;

public class W02_FourWins {
    //Farbcodes
    public static String farbReset = "\u001B[0m";
    public static String cyan = "\u001B[36m";
    public static String red = "\u001B[31m";

    //Spielfeld initialisieren
    public static String[][] spielfeld = new String[6][7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String player1 = " ";
        String player2 = " ";
        String cyanChip = " [" + cyan + "●" + farbReset +"]" ;
        String redChip =  " [" + red + "●" + farbReset + "]" ;

        while (player1.length() < 3 || player1.length() > 15) {
            System.out.println("Bitte gebe den Namen des ersten Spielers ein. Der Name darf nicht kürzer als drei oder" +
                    " länger als 15 Zeichen sein: ");
            player1 = sc.nextLine();
        }
        while (player2.length() < 3 || player2.length() > 15) {
            System.out.println("Bitte gebe den Namen des zweiten Spielers ein Der Name darf nicht kürzer als drei oder" +
                    " länger als 15 Zeichen sein: ");
            player2 = sc.nextLine();
            if (player2.equals(player1)) {
                System.out.println("Der Name wird bereits vom ersten Spieler verwendet. Bitte gebe einen neuen Namen" +
                        "ein der zwischen 3 und 15 Zeichen besteht ein:");
                player2 = sc.nextLine();
            } else {

            }
        }

        System.out.println("Der Name des ersten Spielers ist: " + player1 + " und der Name des zweiten Spielers " +
                "ist: " + player2 + ".");

        //Füllen des Spielfeldes mit leeren Feldern
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                    spielfeld[i][j] = " [ ]";
            }
        }

        printSpielfeld();

        //Spielablauf
        boolean turnPlayer1 = true;
        int zugEingabe = 0;

        //TODO: Siegesbedingungen überprüfen
        while (!spielfeldVoll() && !checkSieg(cyanChip) && !checkSieg(redChip)) {
            if (turnPlayer1 && !checkSieg(redChip)) {
                System.out.println(cyan + player1 + farbReset + " ist dran. Bitte wähle die Spalte in die du deinen Chip einwerfen möchtest: ");
                zugEingabe = sc.nextInt();
                placeChip(zugEingabe, cyanChip);
                turnPlayer1 = false;
                printSpielfeld();
            } else if (!turnPlayer1 && !checkSieg(cyanChip)) {
                System.out.println(red + player2 + farbReset + " ist dran. Bitte wähle die Spalte in die du deinen Chip einwerfen möchtest: ");
                zugEingabe = sc.nextInt();
                placeChip(zugEingabe, redChip);
                turnPlayer1 = true;
                printSpielfeld();
            }
        }
        if (checkSieg(redChip)) {
            System.out.println(red + player2 + farbReset + " hat gewonnen!");
        } else if (checkSieg(cyanChip)) {
            System.out.println(cyan + player1 + farbReset + " hat gewonnen!");
        }
    }

    //Methode zur Spielfeldausgabe
    public static void printSpielfeld() {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                System.out.print(spielfeld[i][j]);
            }
            System.out.println();
        }
        System.out.println("  0   1   2   3   4   5   6");
    }

    public static void placeChip (int column, String chip) {
        for (int i = spielfeld.length - 1; i >= 0; i--) {
            if (spielfeld[i][column] == " [ ]") {
                spielfeld[i][column] = chip;
                return;
            }
        }
        System.out.println("Die gewählte Spalte ist voll, bitte wähle eine andere.");
    }

    public static boolean checkSieg (String chip) {
        //Überprüfung horizontal
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length - 3; j++) {
                if (spielfeld[i][j].equals(chip) && spielfeld[i][j + 1].equals(chip) && spielfeld[i][j + 2].equals(chip)
                && spielfeld[i][j + 3].equals(chip)) {
                    return true;
                }
            }
        }

        //Überprüfung vertikal
        for (int i = 0; i < spielfeld.length - 3; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j].equals(chip) && spielfeld[i + 1][j].equals(chip) && spielfeld[i + 2][j].equals(chip)
                && spielfeld[i + 3][j].equals(chip)) {
                    return true;
                }
            }
        }

        //Überprüfung diagonal rechts hoch
        for (int i = 0; i < spielfeld.length - 3; i++) {
            for (int j = 0; j < spielfeld[i].length - 3; j++) {
                if (spielfeld[i][j].equals(chip) && spielfeld[i + 1][j + 1].equals(chip) && spielfeld[i + 2][j + 2].equals(chip)
                        && spielfeld[i + 3][j + 3].equals(chip)) {
                    return true;
                }
            }
        }

        //Übereprüfung diagonal links hoch
        for (int i = 0; i < spielfeld.length - 3; i++) {
            for (int j = 3; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j].equals(chip) && spielfeld[i + 1][j - 1].equals(chip) && spielfeld[i + 2][j - 2].equals(chip)
                && spielfeld[i + 3][j - 3].equals(chip)) {
                    return true;
                }
            }
        }

        return false;
    }

    //Methode zur Überprüfung ob unentschiedenes Spiel
    public static boolean spielfeldVoll () {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j] == " [ ]") {
                    return false;
                }
            }
        }
        return true;
    }

}
