package com.example.object.override.equals;

import static org.junit.Assert.*;

import org.junit.Test;

public class EqualsTest {

    @Test
    public void testColorPointEqualsFunction() {
        Point p = new Point(1, 2);
        ColorPoint cp1 = new ColorPoint(1, 2, "RED");
        ColorPoint cp2 = new ColorPoint(1, 2, "RED");
        ColorPoint cp3 = new ColorPoint(1, 2, "BLUE");

        assertFalse(cp1.equals(p));
        assertTrue("violate symetry",cp1.equals(cp1));
        assertTrue(cp1.equals(cp2));
        assertTrue(cp2.equals(cp1));
        assertFalse(cp1.equals(cp3));
    }

}
