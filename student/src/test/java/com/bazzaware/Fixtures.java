package com.bazzaware;

import org.junit.Before;

public class Fixtures {
    public Double mark = 1.0;
    public Student student;
    public String firstName = "John";
    public String lastName = "Doe";
    public String course = "BDATS";
    private Double _minMark = 1.0;
    private Double _maxMark = 100.0;
    public Double[][] markData = { { _minMark }, { _maxMark } };

    @Before
    public void setUp() {
        student = new Student(firstName, lastName, course);
    }
}
