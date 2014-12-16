package com.example.object.override.equals;

public class ColorPoint {

    public Point point;
    public String color;

    public ColorPoint(int x, int y, String color) {
        this.point = new Point(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) return true; // for performance optimization
        if (!(o instanceof ColorPoint))
            return false;
        ColorPoint colorPoint = (ColorPoint) o;
        return colorPoint.point.equals(point) && 
                (colorPoint.color == null ? color == null : colorPoint.color.equals(color));// to prevent null pointer exception
    }
}
