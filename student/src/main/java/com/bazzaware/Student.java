package com.bazzaware;

import java.util.UUID;

public abstract class Student extends StudentHelper {
    protected String _lastName;
    protected String _firstName;
    protected String _course;
    protected Double _mark = 0.0;
    protected String _id;

    private Double _minMark = 1.0;
    private Double _maxMark = 100.0;

    public Student(String firstName, String lastName, String course) {
        _firstName = firstName;
        _lastName = lastName;
        _course = course;
        _id = UUID.randomUUID().toString();
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

    public double getMark() {
        return _mark;
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

    public abstract String getGrade();

    public boolean didPass() {
        if (_mark >= 40) {
            return true;
        } else {
            return false;
        }
    }

}
