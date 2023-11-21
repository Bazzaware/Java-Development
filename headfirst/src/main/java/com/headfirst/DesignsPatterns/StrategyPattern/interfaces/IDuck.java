package com.headfirst.DesignsPatterns.StrategyPattern.interfaces;

public abstract class IDuck {
    public IFlyBehavior flyBehavior;
    public IQuackBehavior quackBehavior;

    public IDuck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();

    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(IFlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(IQuackBehavior qb) {
        quackBehavior = qb;
    }
}
