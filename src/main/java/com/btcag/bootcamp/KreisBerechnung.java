package com.btcag.bootcamp;

import java.util.Scanner;

public class KreisBerechnung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double flaeche = radius * (3.14159265359 * 3.14159265359);

        System.out.println(flaeche);
    }
}
