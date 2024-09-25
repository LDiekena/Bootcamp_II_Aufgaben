package com.btcag.bootcamp.W02;

import java.util.Scanner;

public class W02_FibonacciRekursiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl von Iterationen für die Sie die Fibonacci Zahlen haben möchten ein: ");
        int eingabe = sc.nextInt();

        System.out.println("Die Reihe an Fibonacci Zahlen mit " + eingabe + " Iteratoinen ist folgende: ");
        for (int i = 0 ; i < eingabe ; i++) {
            System.out.print(fibonacciRekursiv(i) + " ");
        }
    }

    public static int fibonacciRekursiv(int eingabe) {
        if (eingabe == 0) {
            return 0;
        } else if (eingabe == 1 || eingabe == 2) {
            return 1;
        } else {
            return fibonacciRekursiv(eingabe - 2) + fibonacciRekursiv(eingabe - 1);
        }
    }
}
