package com.bazzaware;

import java.util.UUID;

public class Student {

    private String _lastName;
    private String _firstName;
    private Double _mark;
    private String _id;

    public Student(String FirstName, String LastName, Double Mark) {
        _firstName = FirstName;
        _lastName = LastName;
        if (Mark < 1 || Mark > 100) {
            throw new IllegalArgumentException("Mark must be between 1 and 100");
        }
        _mark = Mark;
        _id = UUID.randomUUID().toString();
    }

    public String GetName() {
        String name = _firstName + " " + _lastName;
        return name;
    }

    public String ToString() {
        String name = _firstName + " " + _lastName;
        String mark = _mark.toString();
        String result = "Name: " + name + " Mark: " + mark;
        return result;
    }

    public String GetId() {
        return _id;
    }

}
