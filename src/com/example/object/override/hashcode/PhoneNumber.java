package com.example.object.override.hashcode;


/**
 * PhoneNumber class have not overridden hashCode() method
 * so it have problem when using it in hashMap
 * 
 * @author CThanh
 *
 */
public final class PhoneNumber {
    private final short areaCode;
    private final int prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 999, "line number");
        this.areaCode = (short)areaCode;
        this.prefix = (short)prefix;
        this.lineNumber = (short)lineNumber;
    }

    private static void rangeCheck(int arg, int i, String field) {
        if (arg > i || i < 1)
            throw new IllegalArgumentException(field + " " + arg);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) o;
        return (pn.areaCode == areaCode) 
                && (pn.lineNumber == lineNumber) 
                && (pn.prefix == prefix);
    }
    
}
