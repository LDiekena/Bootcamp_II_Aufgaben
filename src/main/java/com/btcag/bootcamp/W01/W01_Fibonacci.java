package com.btcag.bootcamp.W01;

import java.util.Scanner;

public class W01_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine ganze Zahl ein, für welche sie die Fibonacci Zahlen haben möchten ein: ");
        int eingabe = sc.nextInt();
        int res = 0;
        int res2 = 1;
        int res3 = 0;

        while (res <= eingabe) {
            System.out.println(res);
            res3 = res + res2;
            res2 = res;
            res = res3;

        }

    }
}
