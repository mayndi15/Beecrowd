package com.br.uri;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double value[] = new double[6];
        int count = 0;
        for (int i = 0; i < 6; i++) {
            value[i] = sc.nextDouble();
            if (value[i] > 0) {
                count++;
            }
        }

        System.out.println(count + " positive numbers");
    }
}
