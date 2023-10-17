package com.bazzaware;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({ "0.0, false", "101.0, false", "1.0, true" })
    public void ShouldReturnTrueIfBetweenOneAndOneHundred(String mark, boolean expectedResult) {
        // arrange

        // act
        boolean result = student.setMark(mark);

        // assert
        assertTrue(result == expectedResult);
    }

}