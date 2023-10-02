package com.bazzaware;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class StudentTest {
    @Test
    public void ShouldReturnFullName() {
        // arrange
        String expectedResult = "John Doe";
        Double mark = 1.0;
        Student student = new Student("John", "Doe", mark);

        // act
        String result = student.GetName();

        // assert
        assert (result).equals(expectedResult);
    }

    @Test
    public void ShouldThrowErrorWhenMarkIsLessThanOne() {
        // arrange
        String firstName = "John";
        String lastName = "Doe";
        Double mark = 0.0;
        String expectedResult = "Mark must be between 1 and 100";
        String result = "";
        // act
        try {
            Student student = new Student(firstName, lastName, mark);
        } catch (IllegalArgumentException e) {
            // assert
            result = e.getMessage();
        }
        assert (result).equals(expectedResult);
    }

    @Test
    public void ShouldThrowErrorWhenMarkIsGreaterThanOneHundred() {
        // arrange
        String firstName = "John";
        String lastName = "Doe";
        Double mark = 101.0;
        String expectedResult = "Mark must be between 1 and 100";
        String result = "";
        // act
        try {
            Student student = new Student(firstName, lastName, mark);
        } catch (IllegalArgumentException e) {
            // assert
            result = e.getMessage();
        }
        assert (result).equals(expectedResult);
    }

    @Test
    public void ShouldReturnFullNameAndMark() {
        // arrange
        String expectedResult = "Name: John Doe Mark: 1.0";
        Double mark = 1.0;
        Student student = new Student("John", "Doe", mark);

        // act
        String result = student.ToString();

        // assert
        assert (result).equals(expectedResult);
    }

    @Test
    public void ShouldReturnADoubleFromAString() {
        // arrange
        Double expectedResult = 1.0;
        String mark = "1.0";
        StudentApp app = new StudentApp();
        // act
        Double result = app.ConvertStringToDouble(mark);

        // assert
        assert result.equals(expectedResult);
    }

    @Test
    public void ShouldThrowErrorIfNotADouble() {
        // arrange
        String expectedResult = "Mark must be a number";
        String mark = "a";
        String result = "";
        StudentApp app = new StudentApp();
        // act
        try {
            app.ConvertStringToDouble(mark);
        } catch (IllegalArgumentException e) {
            // assert
            result = e.getMessage();
        }
        assert (result).equals(expectedResult);
    }

    @Test
    public void ShouldGenerateGuid() {
        // arrange

        // act
        String result = (new Student("John", "Doe", 10.0)).GetId();

        // assert
        assertNotNull(result);
    }
}