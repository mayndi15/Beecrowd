package com.br.uri;

import java.util.Scanner;

public class Wage_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int hour;
        double hourlyWage;
        double wage;

        number = sc.nextInt();
        hour = sc.nextInt();
        hourlyWage = sc.nextDouble();

        wage = hourlyWage * hour;

        System.out.printf("NUMBER = " + number + "\n");
        System.out.printf("WAGE = $ %.2f%n", wage);
    }
}
