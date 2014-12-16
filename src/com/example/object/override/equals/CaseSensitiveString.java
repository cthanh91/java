package com.example.object.override.equals;


/**
 * Symmetry when implement equal method
 * a.equals(b) == b.equals(a) 
 * @author CThanh
 *
 */
public class CaseSensitiveString {
    public String s;

    @Override
    public boolean equals(Object o) {
        return o instanceof CaseSensitiveString 
                && ((CaseSensitiveString) o).s.equalsIgnoreCase(s);
    }
}
