package com.bazzaware;

public class StudentHelper {
    private float _minMark = 1;
    private float _maxMark = 100;

    public boolean setMark(double mark) {
        boolean result = false;

        if (mark >= _minMark && mark <= _maxMark) {
            result = true;
        }
        return result;
    }

    public String getGrade(float mark) {
        String grade = "";
        if (mark >= 70) {
            grade = "First";
        } else if (mark >= 60) {
            grade = "2/1";
        } else if (mark >= 50) {
            grade = "2/2";
        } else if (mark >= 40) {
            grade = "Third";
        } else {
            grade = "Fail";
        }
        return grade;
    }

    public boolean didPass(float mark) {
        if (mark >= 40) {
            return true;
        } else {
            return false;
        }
    }
}
