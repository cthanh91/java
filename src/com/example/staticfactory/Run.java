package com.example.staticfactory;


public class Run {
    public static void main(String[] args) {
        
        //Get Number Instance
        Number number = Number.newInstance();
        System.out.println(number.getNumber());
        Number randomNumber = Number.getRandomNumber();
        System.out.println(randomNumber.getNumber());
        
        //Get Text Instance
        Text instanceOne = Text.getTextInstance();
        Text intanceTwo = Text.getTextInstance();
        System.out.println("Compare by operator : " + (instanceOne == intanceTwo));
        System.out.println("Compare by function : " + (instanceOne.equals(intanceTwo)));
    }
}
