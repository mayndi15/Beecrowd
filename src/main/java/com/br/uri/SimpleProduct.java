package com.br.uri;

import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int PROD;

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);

    }
}
