package com.br.uri.beginner;

import java.util.Scanner;

public class IntervalTwo_1072 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
