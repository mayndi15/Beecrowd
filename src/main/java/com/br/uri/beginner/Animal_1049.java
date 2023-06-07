package com.br.uri.beginner;

import java.util.Scanner;

public class Animal_1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type1 = sc.nextLine();
        String type2 = sc.nextLine();
        String type3 = sc.nextLine();

        String animal = animal(type1, type2, type3);

        System.out.println(animal);
    }

    private static String animal(String type1, String type2, String type3) {
        String animal;

        switch (type1) {
            case "vertebrate":
                switch (type2) {
                    case "bird":
                        switch (type3) {
                            case "carnivore":
                                animal = "eagle";
                                return animal;
                            default:
                                animal = "dove";
                                return animal;
                        }
                    case "mammal":
                        switch (type3) {
                            case "onivoro":
                                animal = "human";
                                return animal;
                            default:
                                animal = "cow";
                                return animal;
                        }
                }
                break;
            default:
                switch (type2) {
                    case "insect":
                        switch (type3) {
                            case "herbivore":
                                animal = "lizard";
                                return animal;
                            default:
                                animal = "flea";
                                return animal;
                        }
                    case "annelid":
                        switch (type3) {
                            case "hematophagous":
                                animal = "leech";
                                return animal;
                            default:
                                animal = "earthworm";
                                return animal;
                        }
                }
        }
        return null;
    }
}
