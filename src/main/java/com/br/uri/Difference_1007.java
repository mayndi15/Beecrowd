package com.br.uri;

import java.util.Scanner;

public class Difference_1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;
        int DIFFERENCE ;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        DIFFERENCE = (A * B - C * D);

        System.out.println("DIFFERENCE = " + DIFFERENCE );
    }
}
