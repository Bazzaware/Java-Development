package com.bazzaware;

import org.junit.Test;

public class CatTest {
    @Test
    public void ShouldAddOneWithEat() {
        // arrange
        Cat cat = new Cat("Kitty", 2, 5);

        // act
        cat.eat();

        // assert
        assert cat.getWeight() == 6;
    }
}
