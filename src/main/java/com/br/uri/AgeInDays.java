package com.br.uri;

import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        int year;
        int month;
        int day;
        int aux;
        age = sc.nextInt();

        year = age / 365;
        aux = age % 365;
        month = aux / 30;
        day = aux % 30;

        System.out.println(year + " year(s)\n" + month + " month(es)\n" + day + " day(s)");

    }
}
