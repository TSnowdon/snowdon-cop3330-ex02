/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Snowdon
 */
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String input = scanner.nextLine();
        System.out.print(input + " has " + input.length() + " characters.");
    }
}
