package com.bytelegend;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }
    Cat() {
        this("");
    }
    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
