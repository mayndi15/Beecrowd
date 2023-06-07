package com.br.uri.beginner;

import java.util.Scanner;

public class GameTime_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hoursStartGame = sc.nextInt();
        int hoursEndGame = sc.nextInt();
        int minutesStartGame = sc.nextInt();
        int minutesEndGame = sc.nextInt();

        int hours = 24 + (hoursEndGame - hoursStartGame);
        int minutes = 60 + (minutesEndGame - minutesStartGame);
        hours--;
        
        System.out.println("The game last " + hours + " hour(s) and " + minutes + "minutes(s)");
    }
}
