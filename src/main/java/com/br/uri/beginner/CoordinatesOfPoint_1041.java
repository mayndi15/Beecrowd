package com.br.uri;

import java.util.Scanner;

public class CoordinatesOfPoint_1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        double y;

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0 && (y > 0 || y < 0)) {
            System.out.println("Y axis");
        } else if (y == 0 && (x > 0 || x < 0)) {
            System.out.println("X axis");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
    }
}
