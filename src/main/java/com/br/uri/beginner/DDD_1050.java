package com.br.uri.beginner;

import java.util.Scanner;

public class DDD_1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ddd = sc.nextInt();

        String destination = findDDD(ddd);

        System.out.println(destination);
    }

    private static String findDDD(int ddd) {
        String destination;

        switch (ddd) {
            case 61:
                destination = "Brasilia";
                return destination;
            case 71:
                destination = "Salvador";
                return destination;
            case 11:
                destination = "Sao Paulo";
                return destination;
            case 21:
                destination = "Rio de Janeiro";
                return destination;
            case 32:
                destination = "Juiz de Fora";
                return destination;
            case 19:
                destination = "Campinas";
                return destination;
            case 27:
                destination = "Vitoria";
                return destination;
            case 31:
                destination = "Belo Horizonte";
                return destination;
        }
        destination = "DDD nao cadastrado";
        return destination;
    }
}
