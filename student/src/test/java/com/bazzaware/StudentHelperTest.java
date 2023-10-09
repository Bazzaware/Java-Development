package com.bazzaware;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StudentHelperTest {
    @Test
    public void ShouldReturnFalseIfLessThanOne() {
        // arrange
        StudentHelper studentHelper = new StudentHelper();

        // act
        boolean result = studentHelper.setMark(0.0);

        // assert
        assertFalse(result);
        ;
    }

    @Test
    public void ShouldReturnFalseIfMoreThanOneHundred() {
        // arrange
        StudentHelper studentHelper = new StudentHelper();

        // act
        boolean result = studentHelper.setMark(101.0);

        // assert
        assertFalse(result);
    }

    public void ShouldReturnTrueIfBetweenOneAndOneHundred() {
        // arrange
        StudentHelper studentHelper = new StudentHelper();

        // act
        boolean result = studentHelper.setMark(1.0);

        // assert
        assertTrue(result);
    }

    @Test
    public void ShouldReturnGradeFirst() {
        // arrange
        StudentHelper studentHelper = new StudentHelper();

        // act
        String result = studentHelper.getGrade();

        // assert
        assertEquals("First", result);
    }

    @Test
    public void ShouldReturnGradeTwoOne() {
        // arrange
        StudentHelper studentHelper = new StudentHelper();

        // act
        String result = studentHelper.getGrade();

        // assert
        assertEquals("Upper Second", result);
    }
}
