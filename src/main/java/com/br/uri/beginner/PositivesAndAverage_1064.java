package com.br.uri.beginner;

import java.util.Scanner;

public class PositivesAndAverage_1064 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        double n;
        int count = 0;
        double average = 0;

        for (int i = 1; i <= 6; i++) {
            n = sc.nextDouble();
            if (n > 0) {
                count++;
                average += n;
            }
        }
        average = average / count;

        System.out.println(count + " positive values");
        System.out.println(String.format("%.1f", average));
    }
}
