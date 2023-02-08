package com.br.uri;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int hour;
        double hourlyWage;
        double salary;

        number = sc.nextInt();
        hour = sc.nextInt();
        hourlyWage = sc.nextDouble();

        salary = hourlyWage * hour;

        System.out.printf("NUMBER = " + number + "\n");
        System.out.printf("SALARY = $ %.2f%n", salary);
    }
}
