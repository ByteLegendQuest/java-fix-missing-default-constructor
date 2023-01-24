package com.bytelegend;

public class Cat {
    public static String name;

    public Cat(String name) {
        Cat.name = name;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
