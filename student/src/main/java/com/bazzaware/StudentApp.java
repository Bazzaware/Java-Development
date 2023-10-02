package com.bazzaware;

import java.util.List;

import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String firstName = "John" + i;
            String lastName = "Doe" + i;
            String course = "BDATS";
            Double mark = 1.0 + i;
            Student student = new Student(firstName, lastName, course, mark);
            students.add(student);
        }

        for (Student student : students) {
            System.out.println(student.ToString());
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
}
