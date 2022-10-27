package com.bytelegend;

public class Cat {
    public String name;

    public Cat() {
        this("");
    }

    public Cat(String _name) {
        name = _name;
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
