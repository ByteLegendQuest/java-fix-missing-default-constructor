package com.bytelegend;

public class Cat {
    public String name;

    Cat() {
        this.name = null;
    }

    Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
