package com.br.uri.root;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value == 0) {
                System.out.println("NULL");
            }
            if (value != 0 && value % 2 == 0) {
                System.out.println("EVEN");
            } else if (value != 0 && !(value % 2 == 0)) {
                System.out.println("ODD");
            }
            if (value > 0) {
                System.out.println("POSITIVE");
            } else if (value < 0) {
                System.out.println("NEGATIVE");

            }
        }
    }
}
