package com.br.uri;

import java.util.Scanner;

public class SimpleCalculation_1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int item;
        int quant;
        double value;
        double total;

        item = sc.nextInt();
        quant = sc.nextInt();
        value = sc.nextDouble();
        total = quant * value;

        item = sc.nextInt();
        quant = sc.nextInt();
        value = sc.nextDouble();

        total = total + quant * value;

        System.out.printf("Amount to pay: $ %.2f%n", total);
    }
}
