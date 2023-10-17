package com.bazzaware;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class HelperTests extends Fixtures {

    @Disabled
    @Test
    public void ShouldPassGetStudentDetails() {
        // arrange
        String expectedResult = "Name: John Doe\nCourse: BDATS" + "\nMark: 1.0";
        StudentApp studentApp = new StudentApp();

        InputStream stdIn = System.in;
        // System.setIn(new ByteArrayInputStream("John\nDoe\nBDATS\n1\n".getBytes()));
        System.setIn(new ByteArrayInputStream("John".getBytes()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;

        // act
        System.setOut(printStream);
        // Student student = studentApp.createStudent();
        System.setIn(stdIn);
        System.setOut(stdout);

        String result = student.toString();

        // assert
        assert (result).equals(expectedResult);
    }

}
