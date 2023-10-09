package com.bazzaware;

public class Student extends StudentHelper {

    public Student(String firstName, String lastName, String course) {
        super(firstName, lastName, course);
    }

    public String getName() {
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
