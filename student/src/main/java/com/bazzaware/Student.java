package com.bazzaware;

import java.util.UUID;

public class Student {

    private String _lastName;
    private String _firstName;
    private String _course;
    private Double _mark;
    private String _id;

    public Student(String firstName, String lastName, String course, Double mark) {
        _firstName = firstName;
        _lastName = lastName;
        _course = course;
        if (mark < 1 || mark > 100) {
            throw new IllegalArgumentException("Mark must be between 1 and 100");
        }
        _mark = mark;
        _id = UUID.randomUUID().toString();
    }

    public String GetName() {
        String name = _firstName + " " + _lastName;
        return name;
    }

    public String ToString() {
        String name = _firstName + " " + _lastName;
        String mark = _mark.toString();
        String result = "Name: " + name + "\nCourse: " + _course + "\nMark: " + mark;
        return result;
    }

    public String GetId() {
        return _id;
    }

}
