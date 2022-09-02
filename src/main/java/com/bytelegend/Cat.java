package com.bytelegend;

public class Cat {
    public String name;

    public Cat () {

    }
    public Cat (String c) {
        name = c;
    }


    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
