package com.bytelegend;

public class Cat {
    public String name;

    Cat(){}

    Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat(" + this.name + ")";
    }
}
