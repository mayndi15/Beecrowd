package com.br.uri;

import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int SUM;

        A = sc.nextInt();
        B = sc.nextInt();

        SUM = A + B;

        System.out.println("SUM = " + SUM);

    }
}
