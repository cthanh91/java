package com.example.generic;

public class Generic<T> {
	T value;
	
	public void setValue(T value){
		this.value = value;
	}
	
	public void print() {
		System.out.println(value.toString());
	}
}
