package com.example.demo;

public class StringChecker {
    private String str;

    public StringChecker(String str) {
        this.str = str;
    }

    public boolean isEqual(String str2) {
        return this.str.equalsIgnoreCase(str2);
    }
}
