package com.bazzaware;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StudentHelperTest {
    @Test
    public void ShouldRetunFalseIfLessThanOne() {
        // arrange
        StudentHelper studentHelper = new StudentHelper();

        // act
        boolean result = studentHelper.setMark(0.0);

        // assert
        assertTrue(result);
    }
}
