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

    public void walk(int distance) {
        for (int i = 0; i < distance; i++) {
            if ((_weight--) <= 5) {
                throw new RuntimeException("Can't walk any further... poor cat will be starved!");
            } else {
                _weight--;
            }
        }
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
