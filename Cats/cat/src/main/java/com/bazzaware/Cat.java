package com.bazzaware;

public class Cat {

    private String _name;
    private int _age;
    private int _weight;

    public Cat(String Name, int Age, int Weight) {
        _name = Name;
        _age = Age;
        _weight = Weight;
    }

    public void walk() {
        _weight--;
    }

    public void display() {
        System.out.println("Name: " + _name + " Age: " + _age + " Weight: " + _weight);
    }

    public void eat() {
        _weight++;
    }

    public int getWeight() {
        return _weight;
    }

}
