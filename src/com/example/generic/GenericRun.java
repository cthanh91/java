package com.example.generic;

public class GenericRun {
	public static void main(String[] args) {
		Generic<Integer> a = new Generic<>();
		a.setValue(12);
		a.print();
	}
}
