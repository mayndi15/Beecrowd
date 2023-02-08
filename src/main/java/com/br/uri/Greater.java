package com.br.uri;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int greaterAB;
        int greaterABC;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        greaterAB = (a + b + Math.abs(a - b)) / 2;
        greaterABC = (greaterAB + c + Math.abs(greaterAB - c)) / 2;

        System.out.println(greaterABC + " is greater");
    }
}
