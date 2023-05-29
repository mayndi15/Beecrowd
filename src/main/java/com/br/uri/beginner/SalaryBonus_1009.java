package com.br.uri.beginner;

import java.util.Scanner;

public class SalaryBonus_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        double salary;
        double sales;
        double total;

        name = sc.next();
        salary = sc.nextDouble();
        sales = sc.nextDouble();

        total = salary + sales * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}
