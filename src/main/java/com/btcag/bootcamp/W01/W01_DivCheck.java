package com.btcag.bootcamp.W01;

import java.util.Scanner;

public class W01_DivCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gebe einen Divisor ein : ");
        int divisor = sc.nextInt();
        System.out.print("Bis zu welcher Zahl soll der eingegebene Divisor überbrüft werden?: ");
        int maxZahl = sc.nextInt();

        while (maxZahl > 0) {
            if (maxZahl % divisor == 0) {
                System.out.println(maxZahl);
                maxZahl--;
            } else {
                maxZahl--;
            }
        }

    }
}
