package com.btcag.bootcamp.W01;

import java.util.Scanner;

public class W01_Subnetting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie das erste Oktett der IP-Adresse an:");
        long oktett1 = sc.nextLong();

        System.out.println("Bitte geben Sie das zweite Oktett der IP-Adresse an:");
        long oktett2 = sc.nextLong();

        System.out.println("Bitte geben Sie das dritte Oktett der IP-Adresse an:");
        long oktett3 = sc.nextLong();

        System.out.println("Bitte geben Sie das vierte Oktett der IP-Adresse an:");
        long oktett4 = sc.nextLong();

        System.out.println("Bitte geben Sie die Subnetzmaske an:");
        long subnetmask = sc.nextLong();

        System.out.println("Die Netzadresse ist die: " + oktett1 + "." + oktett2 + "." + oktett3 + "." + oktett4);

        //TODO:
        System.out.println("Die Broadcastadresse ist die: ");
    }
}
