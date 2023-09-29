package com.bazzaware;

import org.junit.Test;

public class CatTest {
    @Test
    public void ShouldAddOneWithEat() {
        // arrange
        Cat cat = new Cat("Kitty", 2, 5);

        // act
        for (int i = 0; i < 2; i++) {
            cat.eat();
        }

        // assert
        assert cat.getWeight() == 7;
    }

    @Test
    public void ShouldSubtractOneWithWalk() {
        // arrange
        Cat cat = new Cat("Kitty", 2, 5);

        // act
        for (int i = 0; i < 4; i++) {
            cat.walk();
        }

        // assert
        assert cat.getWeight() == 1;
    }
}
