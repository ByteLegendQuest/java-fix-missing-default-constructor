package com.bytelegend;

public class Home {
    public static void main(String[] args) {
        System.out.println(createNewCat("Tom"));
        System.out.println(createNewCatWithDefaultConstructor("Jerry"));
    }

    public static Cat createNewCat(String name) {
        Cat cat = new Cat();
        cat.name = name;
        return name;
    }

    public static Cat createNewCatWithDefaultConstructor(String name) {
        return new Cat(name);
    }
}
