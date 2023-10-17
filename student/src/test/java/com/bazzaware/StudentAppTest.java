package com.bazzaware;

import org.junit.jupiter.api.Test;

public class StudentAppTest {
    @Test
    public void ShouldReturnADoubleFromAString() {
        // arrange
        String mark = "1.0";
        StudentHelper app = new StudentHelper();
        // act
        Boolean result = app.ConvertStringToDouble(mark);

        // assert
        assert result.equals(true);
    }

    @Test
    public void ShouldReturnFalseIfNotADouble() {
        // arrange
        String mark = "a";
        StudentApp app = new StudentApp();
        // act
        Boolean result = app.ConvertStringToDouble(mark);
        assert result.equals(false);
    }

}
