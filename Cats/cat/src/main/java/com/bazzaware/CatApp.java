package com.bazzaware;

import com.bazzaware.helper.HelperApp;

public class CatApp extends HelperApp {

    public static void main(String[] args) {
        Cat cat01 = new Cat("FlatHead", 7, 10);
        Cat cat02 = new Cat("Cupra", 2, 7);
        clearConsole();
        cat01.display();
        cat02.display();
        for (int i = 0; i < 2; i++) {
            cat01.eat();
        }
        cat01.display();
        cat02.display();
    }

}
