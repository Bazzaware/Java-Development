package com.bazzaware;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class StudentTest extends Fixtures {

    @Test
    public void ShouldReturnFullName() {
        // arrange
        String expectedResult = "John Doe";

        // act
        String result = student.GetName();

        // assert
        assert (result).equals(expectedResult);
    }

    @Test
    public void ShouldThrowErrorWhenMarkIsLessThanOne() {
        // arrange
        Double mark = 0.0;
        String expectedResult = "Mark must be between 1 and 100";
        String result = "";
        // act
        try {
            Student student = new Student(firstName, lastName, course, mark);
        } catch (IllegalArgumentException e) {
            // assert
            result = e.getMessage();
        }
        assert (result).equals(expectedResult);
    }

    @Test
    public void ShouldThrowErrorWhenMarkIsGreaterThanOneHundred() {
        // arrange
        Double mark = 101.0;
        String expectedResult = "Mark must be between 1 and 100";
        String result = "";
        // act
        try {
            Student student = new Student(firstName, lastName, course, mark);
        } catch (IllegalArgumentException e) {
            // assert
            result = e.getMessage();
        }
        assert (result).equals(expectedResult);
    }

    @Test
    public void ShouldReturnFullNameAndMark() {
        // arrange
        String expectedResult = "Name: John Doe\nCourse: BDATS" + "\nMark: 1.0";

        // act
        String result = student.ToString();

        // assert
        assert (result).equals(expectedResult);
    }

    @Test
    public void ShouldGenerateGuid() {
        // arrange

        // act
        String result = student.GetId();

        // assert
        assertNotNull(result);
    }

}