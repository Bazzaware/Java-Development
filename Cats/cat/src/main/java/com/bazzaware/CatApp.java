package com.bazzaware;

public class CatApp {
    public static void main(String[] args) {
        Cat cat01 = new Cat("FlatHead", 7, 10);
        Cat cat02 = new Cat("Cupra", 2, 7);

        for (int i = 0; i < 2; i++) {
            cat01.eat();
        }
        cat01.display();
        cat02.display();
    }

}
