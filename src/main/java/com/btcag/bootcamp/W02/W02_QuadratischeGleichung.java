package com.btcag.bootcamp.W02;

import java.util.Scanner;

public class W02_QuadratischeGleichung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe den ersten Parameter a der quadratischen Gleichung ein: ");
        int a = sc.nextInt();
        System.out.println("Bitte gebe den zweiten Parameter b der quadratischen Gleichung ein: ");
        int b = sc.nextInt();
        System.out.println("Bitte gebe den dritten Parameter c der quadratischen Gleichung ein: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            System.out.println("Bei der Formel f(x) = " + a + "x^2 + " + b + "x " + c + " gibt es insgesamt "
            + "2 Lösungen");
        } else if ((a > 0 || a == 0) && b > 0 && (c > 0 || c == 0)) {
            System.out.println("Bei der Formel f(x) = " + a + "x^2 + " + b + "x "  + c + " gibt es insgesamt "
                    + "1 Lösung");
        } else {
            System.out.println("Bei der Formel f(x) = " + a + "x^2 + " + b + "x " + c + " gibt es insgesamt " +
                    "0 Lösungen");
        }
    }
}
