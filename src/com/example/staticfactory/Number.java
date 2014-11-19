package com.example.staticfactory;

public class Number {
    
    private double number;
    
    private Number(double random) {
        this.number = random;
    }

    private Number(){}

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public static Number newInstance(){
        return new Number();
    }
    
    public static Number getRandomNumber(){
        return new Number(Math.random());
    }
}
