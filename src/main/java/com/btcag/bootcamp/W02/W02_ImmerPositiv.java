package com.btcag.bootcamp.W02;

import java.util.Scanner;

public class W02_ImmerPositiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe eine ganze Zahl ein: ");
        int eingabe = sc.nextInt();

        if (eingabe < 0) {
            eingabe = eingabe * -1;
            System.out.println("Die negative Zahl wurde in die positive Zahl " + eingabe + " umgewandelt.");
        } else if (eingabe == 0) {
            System.out.println("Die Zahl " + eingabe + " ist sowohl positiv als auch negativ.");
        } else {
            System.out.println("Die Zahl " + eingabe + " war bereits positiv.");
        }
    }
}
