package com.bazzaware;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class HelperTests extends Fixtures {

    @Test
    public void ShouldPassGetStudentDetails() {
        // arrange
        String expectedResult = "Name: John Doe\nCourse: BDATS" + "\nMark: 1.0";
        StudentApp studentApp = new StudentApp();
        Student student = studentApp.createStudent();

        // act
        String result = student.ToString();

        // assert
        assert (result).equals(expectedResult);
    }

}
