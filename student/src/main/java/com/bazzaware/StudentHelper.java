package com.bazzaware;

import java.util.Scanner;
import java.util.UUID;

public class StudentHelper {
    protected String _lastName;
    protected String _firstName;
    protected String _course;
    protected Double _mark = 0.0;
    protected String _id;

    private Double _minMark = 1.0;
    private Double _maxMark = 100.0;

    public StudentHelper(String firstName, String lastName, String course) {
        _firstName = firstName;
        _lastName = lastName;
        _course = course;
        _id = UUID.randomUUID().toString();
    }

    public StudentHelper() {
    }

    public static void clearConsole() {
        String[] cls = new String[] { "cmd.exe", "/c", "cls" };
        String[] clear = new String[] { "clear" };
        try {
            String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec(cls);
            } else {
                Runtime.getRuntime().exec(clear);
            }
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    public boolean ConvertStringToDouble(String mark) {
        try {
            Double number = Double.parseDouble(mark);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter course name");
        String course = scanner.nextLine();
        Student student = new Student(firstName, lastName, course);
        String mark = "";
        do {
            System.out.println("Enter mark: ");
            mark = scanner.nextLine();
        } while (student.setMark(mark) == false);
        return student;
    }

    public boolean setMark(String mark) {
        boolean result = false;
        if (ConvertStringToDouble(mark)) {
            Double enteredMark = Double.parseDouble(mark);
            if (enteredMark >= _minMark && enteredMark <= _maxMark) {
                _mark = enteredMark;
                result = true;
            }
        } else {
            System.out.println("Invalid mark, please enter a number between 1 and 100");
        }
        return result;
    }

    public String getGrade() {
        String grade = "";
        if (_mark >= 70) {
            grade = "First";
        } else if (_mark >= 60) {
            grade = "2/1";
        } else if (_mark >= 50) {
            grade = "2/2";
        } else if (_mark >= 40) {
            grade = "Third";
        } else {
            grade = "Fail";
        }
        return grade;
    }

    public boolean didPass(double mark) {
        if (mark >= 40) {
            return true;
        } else {
            return false;
        }
    }
}
