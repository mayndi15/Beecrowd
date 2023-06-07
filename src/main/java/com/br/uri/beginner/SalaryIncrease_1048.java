package com.br.uri.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryIncrease_1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");
        double salary = sc.nextDouble();

        double newSalary;
        double percentage;
        double readjustment;

        if (salary <= 400) {
            percentage = 1.15;
            newSalary = salary * percentage;
            readjustment = newSalary - salary;

        } else if (salary <= 800) {
            percentage = 1.12;
            newSalary = salary * percentage;
            readjustment = newSalary - salary;

        } else if (salary <= 1200) {
            percentage = 1.10;
            newSalary = salary * percentage;
            readjustment = newSalary - salary;

        } else if (salary <= 2000) {
            percentage = 1.07;
            newSalary = salary * percentage;
            readjustment = newSalary - salary;

        } else {
            percentage = 1.04;
            newSalary = salary * percentage;
            readjustment = newSalary - salary;
        }

        System.out.println("New salary: " + df.format(newSalary));
        System.out.println("Earned readjustment: " + df.format(readjustment));
        System.out.println("In percentage: " + Math.round((percentage - 1) * 100) + " %");
    }
}
