package com.br.uri.beginner;

import java.util.Scanner;

public class TimeOfEvent_1061 {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        String[] startDate = sc.nextLine().split(" ");
        String[] startTime = sc.nextLine().replaceAll(" ", "").split(":");

        int startDay = Integer.parseInt(startDate[1]);
        int startHour = Integer.parseInt(startTime[0]);
        int startMinute = Integer.parseInt(startTime[1]);
        int startSecond = Integer.parseInt(startTime[2]);

        String[] endDate = sc.nextLine().split(" ");
        String[] endTime = sc.nextLine().replaceAll(" ", "").split(":");

        int endDay = Integer.parseInt(endDate[1]);
        int endHour = Integer.parseInt(endTime[0]);
        int endMinute = Integer.parseInt(endTime[1]);
        int endSecond = Integer.parseInt(endTime[2]);

        int totalDays = endDay - startDay;
        int totalHours = endHour - startHour;
        int totalMinutes = endMinute - startMinute;
        int totalSeconds = endSecond - startSecond;

        if (totalHours < 0) {
            totalHours += 24;
            totalDays -= 1;
        }
        if (totalMinutes < 0) {
            totalMinutes += 60;
            totalHours -= 1;
        }
        if (totalSeconds < 0) {
            totalSeconds += 60;
            totalMinutes -= 1;
        }
        System.out.printf(totalDays + " day (s)" + "\n");
        System.out.printf(totalHours + " hour (s)" + "\n");
        System.out.printf(totalMinutes + " minute (s)" + "\n");
        System.out.printf(totalSeconds + " second (s)");
    }
}
