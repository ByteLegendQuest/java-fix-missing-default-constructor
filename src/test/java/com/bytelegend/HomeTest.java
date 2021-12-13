package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void test() {
        Assertions.assertEquals("Cat(Alice)", Home.createNewCat("Alice").toString());
        Assertions.assertEquals(
                "Cat(Bob)", Home.createNewCatWithDefaultConstructor("Alice").toString());
    }
}
