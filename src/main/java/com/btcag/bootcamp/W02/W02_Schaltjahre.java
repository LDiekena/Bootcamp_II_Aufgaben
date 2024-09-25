package com.btcag.bootcamp.W02;

import java.util.Scanner;

public class W02_Schaltjahre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Jahreszahl an bei der Sie überprüfen möchten ob es sich um ein" +
                " Schaltjahr handelt: ");
        long eingabe = sc.nextLong();

        if ((eingabe % 4 == 0) && (eingabe % 100 > 0 || eingabe % 400 == 0)) {
            System.out.println("Das Jahr " + eingabe + " ist ein Schaltjahr.");
        } else {
            System.out.println("Das Jahr " + eingabe + " ist kein Schaltjahr.");
        }
    }
}
