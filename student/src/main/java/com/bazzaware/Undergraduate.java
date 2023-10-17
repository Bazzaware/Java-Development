package com.bazzaware;

public class Undergraduate extends Student {

    public Undergraduate(String firstName, String lastName, String course) {
        super(firstName, lastName, course);
    }

    @Override
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
}
