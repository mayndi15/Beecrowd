package com.br.uri.beginner;

import java.util.Scanner;

public class SixOddNumbers_1070 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int count = 0;
        while (count < 6) {
            if (!(x % 2 == 0)) {
                System.out.println(x);
                count++;
            }
            x++;
        }
    }
}
