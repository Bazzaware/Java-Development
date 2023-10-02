package com.bazzaware;

import org.junit.Test;

public class CatTest {
    @Test
    public void ShouldAddOneWithEat() {
        // arrange
        Cat cat = new Cat("Kitty", 2, 5);

        // act
        for (int i = 0; i < 2; i++) {
            cat.eat(1);
        }

        // assert
        assert cat.getWeight() == 7;
    }

    @Test
    public void ShouldSubtractOneWithWalk() {
        // arrange
        Cat cat = new Cat("Kitty", 2, 10);

        // act
        cat.walk(1);

        // assert
        assert cat.getWeight() == 9;
    }

    @Test
    public void ShouldNotGoBelowWeight5() {
        // arrange
        Cat cat = new Cat("Kitty", 2, 10);

        // act
        for (int i = 0; i < 5; i++) {
            cat.walk(1);
        }

        // assert
        assert cat.getWeight() == 5;
    }

    @Test
    public void ShouldPrintMessageWhenWeightReaches5() {
        // arrange
        Cat cat = new Cat("Kitty", 2, 10);
        String expected = "Can't walk any further... poor cat will be starved!";
        String result = "";
        // act
        try {
            cat.walk(6);
        } catch (RuntimeException e) {
            // assert
            result = e.getMessage();
        }

        // assert
        assert result.equals(expected);
    }
}
