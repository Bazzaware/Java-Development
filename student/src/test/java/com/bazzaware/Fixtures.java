package com.bazzaware;

import org.junit.Before;

public class Fixtures {
    Double mark = 1.0;
    Student student;
    String firstName = "John";
    String lastName = "Doe";
    String course = "BDATS";

    @Before
    public void setUp() {
        student = new Student(firstName, lastName, course, mark);
    }
}
