package com.bazzaware;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentApp extends StudentHelper {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<String> allMarks = Arrays.asList("39.0", "40.0", "50.0", "60.0", "70.0");
        boolean test = false;
        clearConsole();
        if ((args != null) && (args.length > 0)) {
            test = (args[0].equals("-auto"));
        }

        for (int i = 0; i < 5; i++) {
            if (test) {
                String firstName = "John" + i;
                String lastName = "Doe" + i;
                String course = "BDATS";
                Student student = new Student(firstName, lastName, course);
                student.setMark(allMarks.get(i));
                students.add(student);
            } else {
                System.out.println("\nEnter Student Details " + (i + 1));
                Student student = createStudent();
                students.add(student);
            }
        }

        System.out.println("=============\nPrint Details\n=============");
        printStudentDetails(students);
        System.out.println("=====================\nPrint Name and Course\n=====================");
        for (Student student : students) {
            System.out.println("=============\n" + //
                    "Name: " + student.getName());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("Pass: " + student.didPass());
        }
    }

    private static void printStudentDetails(List<Student> students) {
        for (Student student : students) {
            System.out.println("-----------------\n" + student + "\n-----------------");
        }
    }
}
