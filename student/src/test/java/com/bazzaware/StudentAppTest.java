package com.bazzaware;

import org.junit.Test;

public class StudentAppTest {
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

}
