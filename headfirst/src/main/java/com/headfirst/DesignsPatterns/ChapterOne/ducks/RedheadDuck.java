package com.headfirst.DesignsPatterns.ChapterOne.ducks;

import com.headfirst.DesignsPatterns.ChapterOne.interfaces.IDuck;

public class RedheadDuck extends IDuck {

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck");
    }

}
