package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class StringCheckerTests {
    @Test
    public void testSampleService() {
        StringChecker sc = new StringChecker("aman");
        assertTrue(sc.isEqual("bill"));
    }

    @Test
    public void testSampleService2() {
        StringChecker sc = new StringChecker("aman");
        assertTrue(sc.isEqual("aman"));
    }
}
