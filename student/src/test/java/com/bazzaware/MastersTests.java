package com.bazzaware;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MastersTests extends Fixtures {
    @ParameterizedTest
    @CsvSource({ "70.0, Distinction", "60.0, Merit", "40.0, Pass", "39.0, Fail" })
    public void ShouldReturnCorrectGrade(String mark, String expectedGrade) {
        // arrange
        String result = "";
        Masters masters = new Masters(firstName, lastName, course);

        // act
        masters.setMark(mark);
        result = masters.getGrade();

        // assert
        assert (result).equals(expectedGrade);

    }
}