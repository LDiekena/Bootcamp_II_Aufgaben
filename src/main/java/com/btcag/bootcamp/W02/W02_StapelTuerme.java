package com.btcag.bootcamp.W02;

public class W02_StapelTuerme {
    public static void main(String[] args) {
        /*
        int[] ersterStab  = {1,2,3,4};
        int[] zweiterStab = {0,0,0,0};
        int[] dritterStab = {0,0,0,0};
         */

        drawHistoryTower(4, 'A', 'B', 'C');
    }

    public static void drawHistoryTower(int etage, char ersterStab, char zweiterStab, char dritterStab) {
        if (etage == 0){
            return;
        }
        drawHistoryTower(etage-1, ersterStab, dritterStab, zweiterStab);
        System.out.println("Bewege Scheibe auf Etage: " + etage + " von: " + ersterStab + " nach: " + zweiterStab);
        drawHistoryTower(etage-1, dritterStab, zweiterStab, ersterStab);
    }

}
