package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        greeting();
//        String name = repeatName();
//        int age = ageGuess();
//        int count = counting();
//        String answer = knowledge();
//        story(name, age, count, answer);
        counting();

    }
    public static void greeting() {
        System.out.println("sup");
    }
    public static String repeatName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uh...what did you say your name was again? ");
        String name = scanner.nextLine().trim();
        System.out.println("cool name bro");
        return name;
    }
    public static int ageGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wanna play a game? ");
        String response = scanner.nextLine();
        System.out.println("Rhetorical question. We're playing one.");
        System.out.println("I bet I can guess your age. If I guess it correctly, type \"yes\". By the way, we're doing this until I get it right.");
        while(true) {
            int guess = (int)(Math.random() * 100);
            System.out.println("Is it " + guess + "?");
            response = scanner.nextLine();
            if (response.equals("yes")) {
                System.out.println("Hell yeah, first try.");
                return guess;
            }
        }
    }
    public static int counting() {
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
        }return input;
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
                return answer;
            } else
                System.out.println("wrong, try again");
        }
    }
    public static void story(String nameResult, int ageResult, int countResult, String knowledgeResult) {
        System.out.println("This is the story of " + nameResult + "."
        + "They are definitely " + ageResult + " years old and totally didn't lie about it to stop me guessing their age anymore." + "\n"
                + " Surprisingly, " + nameResult + " can count all the way to " + countResult + ", provided they are assisted by a computer." + "\n"
                + " However, " + nameResult + "'s greatest feat is that they can eventually guess the correct answer \"" + knowledgeResult + "\"" + "\n"
                + " of a multiple choice question (given enough tries).");

    }
    public static void dayOfWeek() {
        Scanner scanner = new Scanner(System.in);

    }
}