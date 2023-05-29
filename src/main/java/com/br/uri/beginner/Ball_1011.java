package com.br.uri;

import java.util.Scanner;

public class Ball_1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius;
        double volume;

        radius = sc.nextDouble();

        volume = (4.0/3) * 3.14159 * Math.pow(radius, 3);

        System.out.printf("Volume = %.3f%n", volume);
    }
}
