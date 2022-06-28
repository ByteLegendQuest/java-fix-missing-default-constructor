package com.bytelegend;

public class Cat {
    public String name;

    public Cat(String Name) {
        name = Name;
    }

    public Cat() {
        this("");
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
