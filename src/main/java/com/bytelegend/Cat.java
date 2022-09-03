package com.bytelegend;

public class Cat {
    public String name;

    public Cat(String name) {
        name = name;
    }

    public Cat(String name) {
        this.name = name;
    }
    
    public Cat() {
        this.name = "";
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
