package com.headfirst.DesignsPatterns.ChapterOne.classes;

import com.headfirst.DesignsPatterns.ChapterOne.interfaces.IQuackBehavior;

public class MuteQuack implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}
