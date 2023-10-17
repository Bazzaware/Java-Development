package com.bazzaware;

public class Masters extends Student {

    public Masters(String firstName, String lastName, String course) {
        super(firstName, lastName, course);
    }

    @Override
    public String getGrade() {
        String grade = "";
        if (_mark >= 70) {
            grade = "Distinction";
        } else if (_mark >= 60) {
            grade = "Merit";
        } else if (_mark >= 40) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }
        return grade;
    }

}
