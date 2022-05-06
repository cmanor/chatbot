package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        greeting();
        repeatName();
        ageGuess();

    }
    public static void greeting() {
        System.out.println("sup");
    }
    public static void repeatName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uh...what did you say your name was again? ");
        String name = scanner.nextLine();
        System.out.println("cool name bro");
    }
    public static void ageGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wanna play a game? ");
        String response = scanner.nextLine();
        System.out.println("Rhetorical question. We're playing one.");
        System.out.println("I bet I can guess your age. If I guess it right type \"yes\" ");
        while(true) {
            System.out.println("Is it " + (int)(Math.random() * 100) + "?");
            response = scanner.nextLine();
            if (response.equals("yes"))
                System.out.println("Hell yeah, first try.");
                break;
        }
    }
    public static void counting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now enter a number and I'll count to it");


    }
    public static void knowledge() {
        Scanner scanner = new Scanner(System.in);

    }
}