package com.bazzaware;

import org.junit.Before;

public class Fixtures {
    public Double mark = 1.0;
    public Student student;
    public String firstName = "John";
    public String lastName = "Doe";
    public String course = "BDATS";
    private float _minMark = 1;
    private float _maxMark = 100;
    public float[][] markData = { { _minMark }, { _maxMark } };

    @Before
    public void setUp() {
        student = new Student(firstName, lastName, course);
    }
}
