package com.bazzaware;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StudentTest extends Fixtures {

    @Test
    public void ShouldReturnFullName() {
        // arrange
        String expectedResult = "John Doe";

        // act
        String result = student.getName();

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
    @Test
    public void ShouldReturnFalseIfLessThanOne() {
        // arrange

        // act
        boolean result = student.setMark("0.0");

        // assert
        assertFalse(result);
        ;
    }

    @Test
    public void ShouldReturnFalseIfMoreThanOneHundred() {
        // arrange

        // act
        boolean result = student.setMark("101.0");

        // assert
        assertFalse(result);
    }

    public void ShouldReturnTrueIfBetweenOneAndOneHundred() {
        // arrange

        // act
        boolean result = student.setMark("1.0");

        // assert
        assertTrue(result);
    }


}