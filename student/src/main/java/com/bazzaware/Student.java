package com.bazzaware;

import java.util.UUID;

public class Student {

    private String _lastName;
    private String _firstName;
    private String _course;
    private Double _mark;
    private String _id;

    public Student(String firstName, String lastName, String course) {
        _firstName = firstName;
        _lastName = lastName;
        _course = course;
        _mark = 0.0;
        _id = UUID.randomUUID().toString();
    }

    public String GetName() {
        String name = _firstName + " " + _lastName;
        return name;
    }

    public String toString() {
        String name = _firstName + " " + _lastName;
        String mark = _mark.toString();
        String result = "Name: " + name + "\nCourse: " + _course + "\nMark: " + mark;
        return result;
    }

    public String GetId() {
        return _id;
    }
}
