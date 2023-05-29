package com.br.uri;

import java.util.Scanner;

public class TimeConversion_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int hours;
        int minutes;
        int seconds;
        int aux;

        N = sc.nextInt();

        aux = N / 60;
        seconds = N % 60;
        minutes = aux % 60;
        hours =  aux / 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
