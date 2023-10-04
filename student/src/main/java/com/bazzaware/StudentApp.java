package com.bazzaware;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {
    private Scanner scanner;

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String firstName = "John" + i;
            String lastName = "Doe" + i;
            String course = "BDATS";
            Double mark = 69.0 + i;
            Student student = new Student(firstName, lastName, course);
            students.add(student);
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Double ConvertStringToDouble(String mark) {
        try {
            Double number = Double.parseDouble(mark);
            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Mark must be a number");
        }
    }

    public Student createStudent() {
        System.out.println("Enter first name");
        String firstName = scanner.nextLine();
        String lastName = "Doe";
        String course = "BDATS";
        Double mark = 1.0;

        Student student = new Student(firstName, lastName, course);
        return student;
    }
}
