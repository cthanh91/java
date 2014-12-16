package com.example.object.override.equals;

import java.util.Date;

public class Point {
    public int x;
    public int y;
    /*Do not compare it in equals comparison because it's immuatable
      Think about immuatable class first
    */
    public Date date; 

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point p = (Point) o;
            return p.x == x && p.y == y;
        }
        return false;
    }
}
