package com.bazzaware.com528;

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
}
