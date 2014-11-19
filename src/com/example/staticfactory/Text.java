package com.example.staticfactory;

public class Text {
    private static Text text = new Text();

    public Text() {}

    public static Text getTextInstance(){
        return Text.text;
    }
}
