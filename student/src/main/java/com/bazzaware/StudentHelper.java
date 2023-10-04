package com.bazzaware;

public class StudentHelper {
    private float _minMark = 1;
    private float _maxMark = 100;

    public boolean setMark(double mark) {
        boolean result = false;

        if (mark >= _minMark && mark <= _maxMark) {
            result = true;
        }
        return result;
    }

}
