package com.bytelegend;

public class Cat {
    public String name;

    public Cat(String n) {
        name = n;
    }

    public Cat() {
        
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
