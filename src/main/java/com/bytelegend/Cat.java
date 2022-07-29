package com.bytelegend;

public class Cat {
    public String name;

    public Cat(String name) {
        name = name;
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }

    public Cat() {
    }
}
