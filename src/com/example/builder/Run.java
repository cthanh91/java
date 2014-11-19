package com.example.builder;

public class Run {
    public static void main(String[] args) {
        NutritionFactsBuilder nutritionFacts = new NutritionFactsBuilder.Builder(
                1, 2).calories(3).fat(4).build();
        System.out.println(nutritionFacts.getServings());
    }
}
