package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        greeting();
        String name = repeatName();
        int age = ageGuess();
        int count = counting();
        String answer = knowledge();
        story(name, age, count, answer);
        dayOfWeek();


    }
    public static void greeting() {
        System.out.println("sup");
    }
    public static String repeatName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Uh...what did you say your name was again? ");
        String name = scanner.nextLine().trim();
        System.out.println("Cool name bro.");

        scanner.close();
        return name;
    }
    public static int ageGuess() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wanna play a game? ");
        scanner.nextLine();
        System.out.println("Rhetorical question. We're playing one.");
        System.out.println("I bet I can guess your age. If I guess it correctly, type \"yes\". By the way, we're doing this until I get it right.");

        while(true) {

            int guess = (int)(Math.random() * 100);
            System.out.println("Is it " + guess + "?");
            String response = scanner.nextLine();

            if (response.equals("yes")) {
                System.out.println("Hell yeah, first try.");

                scanner.close();
                return guess;
            }
        }
    }
    public static int counting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now enter a number greater than 1 and I'll count to it.");

        int input = Integer.parseInt(scanner.nextLine());
        while(input <2) {
            System.out.println(" I said greater than one");
            input = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 1; i <= input; i++) {
            System.out.println(i);
        }
        scanner.close();
        return input;
    }
    public static String knowledge() {
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
                scanner.close();
                return answer;

            } else
                System.out.println("wrong, try again");
        }
    }
    public static void story(String nameResult, int ageResult, int countResult, String knowledgeResult) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to hear a story?");
        scanner.nextLine();
        scanner.close();
        System.out.println("Again, that was rhetorical. I don't care what you think. I am a computer.");
        System.out.println("This is the story of " + nameResult + "."
        + "They are definitely " + ageResult + " years old and totally didn't lie about it to stop me guessing their age anymore." + "\n"
                + " Surprisingly, " + nameResult + " can count all the way to " + countResult + ", provided they are assisted by a computer." + "\n"
                + " However, " + nameResult + "'s greatest feat is that they can eventually guess the correct answer \"" + knowledgeResult + "\"" + "\n"
                + " of a multiple choice question (given enough tries).");

    }
    public static void dayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ask me how I feel about different days of the week!");
        String input ="";
        while (!input.equals("quit")){
            System.out.println("Type a day of the week or \"quit\" to close the program.");
            input = scanner.nextLine().toLowerCase();
                switch (input) {
                    case "monday" -> System.out.println("You don't hate Mondays. You hate capitalism.");
                    case "tuesday" -> System.out.println("Apparently the least crowded time to shop at Costco in the evening.");
                    case "wednesday" -> System.out.println("Kind of feels like Friday when you work from home Thursday/Friday.");
                    case "thursday" -> System.out.println("I get to work from home. It's dope.");
                    case "friday" -> System.out.println("Who doesn't love Friday?");
                    case "saturday" -> System.out.println("Finally, some time to relax.");
                    case "sunday" -> System.out.println("Sundays are fine, I guess.");
                    default -> System.out.println("learn how to spell, moron");
            }
        }scanner.close();
    }
}