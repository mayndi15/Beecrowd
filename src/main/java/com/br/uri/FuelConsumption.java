package com.br.uri;

import java.util.Scanner;

public class FuelConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours;
        int km;
        int distance;
        double liters;

        hours = sc.nextInt();
        km = sc.nextInt();

        distance = hours * km;
        liters = distance / 12.0;

        System.out.println(String.format("%.3f", liters));
    }
}
