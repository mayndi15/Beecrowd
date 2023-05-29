package com.br.uri;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleSort_1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] sortedArray = {n1, n2, n3};
        int[] array = {n1, n2, n3};

        Arrays.sort(sortedArray);
        for (int num : sortedArray) {
            System.out.println(num);
        }

        System.out.println();

        for (int num : array) {
            System.out.println(num);
        }
    }
}
