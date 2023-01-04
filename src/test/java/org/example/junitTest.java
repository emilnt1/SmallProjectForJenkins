package org.example;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class junitTest {

    @Test
    public void test() {
        String str = "JUnit is working fine";
        assertEquals("JUnit is working fine", str);
    }
}
