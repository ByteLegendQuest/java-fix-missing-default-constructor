package com.bytelegend;

public class Cat {
    public String name;

    public Cat() {
        this("");
    }

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
