package com.bazzaware;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class UserInputExample {
    private Scanner scanner;
    private PrintStream printStream;

    public UserInputExample(InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public void start() {
        printStream.println("Enter number 1");
        int x = Integer.parseInt(scanner.nextLine());
        printStream.println("Enter number 2");
        int y = Integer.parseInt(scanner.nextLine());
        printStream.println("output: " + (x + y));
    }

    public static void main(String[] args) {
        UserInputExample userInputExample = new UserInputExample(System.in, System.out);
        userInputExample.start();
    }
}