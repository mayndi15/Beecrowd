package com.br.uri;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius;
        double area;
        double n = 3.14159;

        radius = sc.nextDouble();

        area = n * Math.pow(radius, 2);

        System.out.printf("A=%.4f%n", area);

    }
}
