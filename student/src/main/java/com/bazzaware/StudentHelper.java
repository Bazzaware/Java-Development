package com.bazzaware;

public class StudentHelper {

    public boolean setMark(double mark) {
        boolean result = false;
        if (mark < 1 && 100 <= mark) {
            result = true;
        }
        return result;
    }

}
