package com.br.uri.beginner;

import java.util.Scanner;

public class PairsFiveNumbers_1065 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int n;
        int count = 0;

        for (int i = 1; i <= 5; i++) {
            n = sc.nextInt();
            if (n % 2 == 0) {
                count++;
            }
        }
        System.out.println(count + " even values");
    }
}
