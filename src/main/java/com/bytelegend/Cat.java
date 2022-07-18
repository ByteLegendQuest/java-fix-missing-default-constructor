package com.bytelegend;

public class Cat {
    public String name;

    Cat() {
        this("");
    }
    public Cat(String name) {
        this.name = new String(name);
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
