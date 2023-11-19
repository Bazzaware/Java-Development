package com.headfirst.DesignsPatterns.ChapterOne;

import com.headfirst.DesignsPatterns.ChapterOne.classes.MallardDuck;
import com.headfirst.DesignsPatterns.ChapterOne.interfaces.IDuck;

public class Main {
    public static void main(String[] args) {
        IDuck mallard = new MallardDuck();
        mallard.performQuack(); // Quack
        mallard.performFly(); // I'm flying!!
    }
}
