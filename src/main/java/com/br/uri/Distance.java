package com.br.uri;

import java.util.Scanner;

public class Distance {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int km;
        int minutes;

        km = sc.nextInt();

        minutes = (60 * km) / 30;

        System.out.println(minutes + " minutes");
    }
}
