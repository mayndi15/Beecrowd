package com.br.uri.beginner;

import java.util.Scanner;

public class NotesAndCoins_1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total;
        total = sc.nextDouble();

        int cells = (int) total;
        int coins = (int) ((total - cells) * 100);
        int aux;

        if (total > 0 && total < 1000000) {
            int[] listCells = {100, 50, 20, 10, 5, 2};

            for (int listCell : listCells) {
                aux = cells / listCell;
                cells -= aux * listCell;
                System.out.println(aux + " cells de $ " + listCell + ".00");
            }

            aux = cells;
            System.out.println(aux + " coins de $ 1.00");

            int[] listCoins = {50, 25, 10, 5, 1};
            for (int listCoin : listCoins) {
                aux = coins / listCoin;
                coins -= aux * listCoin;
                System.out.println(aux + " coins de $ 0." + listCoin);
            }
        }
    }
}
