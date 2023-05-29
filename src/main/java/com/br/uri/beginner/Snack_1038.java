package com.br.uri.beginner;

import java.util.Scanner;

public class Snack_1038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total;
        int id;
        int amount;

        id = sc.nextInt();
        amount = sc.nextInt();

        switch (id) {
            case 1:
                total = amount * 4.00;
                break;
            case 2:
                total = amount * 4.50;
                break;
            case 3:
                total = amount * 5.00;
                break;
            case 4:
                total = amount * 2.00;
                break;
            case 5:
                total = amount * 1.50;
                break;
            default:
                total = 0;
        }
        System.out.printf("Total: $ %.2f%n", total);
    }
}
