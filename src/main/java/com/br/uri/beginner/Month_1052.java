package com.br.uri.beginner;

import java.util.Scanner;

public class Month_1052 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        String monthDescription = getMonth(month);

        System.out.println(monthDescription);
    }

    private static String getMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return null;
    }
}
