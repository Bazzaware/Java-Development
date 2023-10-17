package com.bazzaware;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UndergraduateTests extends Fixtures {
    @ParameterizedTest
    @CsvSource({ "70.0, First", "60.0, 2/1", "50.0, 2/2", "40.0, Third", "39.0, Fail" })
    public void ShouldReturnCorrectGrade(String mark, String expectedGrade) {
        // arrange
        String result = "";
        Undergraduate undergraduate = new Undergraduate(firstName, lastName, course);

        // act
        undergraduate.setMark(mark);
        result = undergraduate.getGrade();

        // assert
        assert (result).equals(expectedGrade);
    }

    @ParameterizedTest
    @CsvSource({ "40.0, true", "39.0, false" })
    public void ShouldReturnTrueIfGradeIsGreaterThanForty(String mark, boolean expectedResult) {

        // arrange
        Student student = new Undergraduate(firstName, lastName, course);

        // act
        student.setMark(mark);

        // assert
        assertTrue(expectedResult == student.didPass());
    }

    @ParameterizedTest
    @CsvSource({ "0.0, false", "39.0, false" })
    public void ShouldReturnFalseIfGradeIsLessThanForty(String mark, boolean expectedResult) {

        // arrange
        Student student = new Undergraduate(firstName, lastName, course);

        // act
        student.setMark(mark);

        // assert
        assertTrue(expectedResult == student.didPass());
    }

    @Test
    public void ShouldReturnTrueIfGradeIsGreaterThanForty() {

        // arrange
        Student student = new Undergraduate(firstName, lastName, course);

        // act
        student.setMark("40.0");

        // assert
        assertTrue(student.didPass());
    }

    @Test
    public void ShouldReturnFalseIfGradeIsLessThanForty() {

        // arrange
        Student student = new Undergraduate(firstName, lastName, course);

        // act
        student.setMark("39.0");

        // assert
        assertFalse(student.didPass());
    }

}
