package com.example.model;

public enum Priority {
    INSTANCE;

    private String value = "This is a Priority Object";
    
    public void run() {
        System.out.println(value);
    }
}
