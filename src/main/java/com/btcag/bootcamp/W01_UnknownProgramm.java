package com.btcag.bootcamp;

import java.util.Scanner;

public class W01_UnknownProgramm {
    public static void main(String[] args) {
        // Vor Programmdurchlauf
        /* Programm ließt zwei Werte als long Variable ein, initiiert eine result Variable mit 0, die Schleife
        prüft ab ob der erste Wert -1 größer als 0 ist und solange das der Fall ist zählt er von der Variablen tmp
        immer ein runter und steigert mit jeder Iteration den Wert in result um 1, am Ende kommt also die Anzahl der
        Iterationen als result raus, diese wird dem Nutzer angezeigt
         */


        //Programm zum Test ob richtig gedacht
        Scanner readIn = new Scanner(System.in);
        System.out.println("Wert1: ");
        long value1 = readIn.nextLong();
        System.out.println("Wert2: ");
        long value2 = readIn.nextLong();

        long result = 0;
        while (value1-- >0) {
            long temp = value2;
            System.out.println(temp);
            while (temp-- > 0) {
                result += 1;
                System.out.println(result);
            }
        }
        System.out.println("Result " + result);
    }
}
