package com.example.builder;

public class NutritionFactsBuilder {

    private final int servingSize; // (mL) required
    private final int servings;    // (per container) required
    private final int calories;    // optional
    private final int fat;         // (g) optional
    private final int sodium;      // (mg) optional
    private final int carbohydrate; // (g) optional

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public static class Builder {
        // required parameter
        private final int servingSize;
        private final int servings;
        // Optional parameter
        private int       calories     = 0;
        private int       fat          = 0;
        private int       sodium       = 0;
        private int       carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servings;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }
        
        public Builder fat(int val){
            fat = val;
            return this;
        }
        
        public Builder sodium(int val){
            sodium = val;
            return this;
        }
        
        public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }
        
        public NutritionFactsBuilder build(){
            return new NutritionFactsBuilder(this);
        }
    }
    
    public NutritionFactsBuilder(Builder builder) {
        this.calories = builder.calories;
        this.carbohydrate = builder.carbohydrate;
        this.servings = builder.servings;
        this.servingSize = builder.servingSize;
        this.sodium = builder.sodium;
        this.fat = builder.fat;
    }

}
