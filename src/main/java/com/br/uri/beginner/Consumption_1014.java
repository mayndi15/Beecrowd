package com.br.uri.beginner;

import java.util.Scanner;

public class Consumption_1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X;
        double Y;
        double average;

        X = sc.nextInt();
        Y = sc.nextDouble();

        average = X / Y;

        System.out.println(String.format("%.3f km/l", average));
    }
}
