package com.br.uri;

import java.util.Scanner;

public class Bills_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money;
        money = sc.nextInt();

        if (money > 0 && money < 1000000) {
            int cells[] = {100, 50, 20, 10, 5, 2, 1};

            System.out.println(money);

            for (int i = 0; i < cells.length; i++) {
                System.out.println(money / cells[i] + " cells de $ " + cells[i] + ",00");
                money = money % cells[i];
            }
        }
    }
}