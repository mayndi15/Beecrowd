package com.br.uri;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TypesOfTriangles_1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double[] array = {A, B, C};
        double[] arrayDesc = Arrays.stream(array).boxed().sorted(Collections.reverseOrder())
                .mapToDouble(Double::doubleValue).toArray();

        A = arrayDesc[0];
        B = arrayDesc[1];
        C = arrayDesc[2];

        if (A >= (B + C)) {
            System.out.println("DOES NOT FORM TRIANGLE");
        } else {
            if (A * A == (B * B) + (C * C)) System.out.println("RECTANGLE TRIANGLE");
            if (A * A > (B * B) + (C * C)) System.out.println("OBTUSANGLE TRIANGLE");
            if (A * A < (B * B) + (C * C)) System.out.println("ACUTANGULO TRIANGLE");
            if (A == B && A == C) System.out.println("EQUILATERAL TRIANGLE");
            if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A))
                System.out.println("ISOSCELES TRIANGLE");
        }
    }
}