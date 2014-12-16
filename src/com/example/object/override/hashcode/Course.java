package com.example.object.override.hashcode;

public class Course {

    private final int INITIAL_NUMBER = 31;
    private int year;

    public Course(int year) {
        this.year = year;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o == this) return true;
        if(!(o instanceof Course))
            return false;
        return ((Course)o).year == year;
    }
    
    @Override
    public int hashCode() {
        int result = 0;
        result = INITIAL_NUMBER * result + year;
        return result;
    }
}
