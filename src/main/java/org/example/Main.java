package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        greeting();
        repeatName();
        ageGuess();
        counting();
        knowledge();

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
        System.out.println("I bet I can guess your age. If I guess it right type \"yes\". By the way, we're doing this until I get it right.");
        while(true) {
            System.out.println("Is it " + (int)(Math.random() * 100) + "?");
            response = scanner.nextLine();
            if (response.equals("yes")) {
                System.out.println("Hell yeah, first try.");
                break;
            }
        }
    }
    public static void counting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now enter a number greater than 1 and I'll count to it");
        int input = Integer.parseInt(scanner.nextLine());
        while(input <2) {
            System.out.println(" I said greater than one");
            input = Integer.parseInt(scanner.nextLine());
            if (input > 1) {
                for (int i = 1; i <= input; i++) {
                    System.out.println(i);
                }
            }
        }
    }
    public static void knowledge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Time to test your programming knowledge.");

        while(true){
            System.out.println("What kind of loop did I use to write this question?");
            System.out.println("A: for loop ");
            System.out.println("B: while loop");
            System.out.println("C: do while loop");
            System.out.println("D: unstoppable loop");
            String answer = scanner.nextLine().toUpperCase();

            if (answer.equals("B")){
                System.out.println("Good job! You did it!");
                break;
            } else
                System.out.println("wrong, try again");
        }
    }
    public static void story() {
        Scanner scanner = new Scanner(System.in);

    }public static void dayOfWeek() {
        Scanner scanner = new Scanner(System.in);

    }
}