package com.bytelegend;

public class Cat {
    public String name;

    public Cat() {}

    public Cat(String s) {
        name = s;
    } 

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
