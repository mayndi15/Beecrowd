package com.br.uri.beginner;

import java.util.Scanner;

public class EvenOddPositiveNegative_1066 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int n;
        int even = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 1; i <= 5; i++) {
            n = sc.nextInt();
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            }
        }
        System.out.println(even + " even value(s)");
        System.out.println(odd + " odd value(s)");
        System.out.println(positive + " positive value(s)");
        System.out.println(negative + " negative value(s)");
    }
}
