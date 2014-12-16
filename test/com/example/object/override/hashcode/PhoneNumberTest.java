package com.example.object.override.hashcode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class PhoneNumberTest {

    
    @Test
    public void test() {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(90, 90, 90), "CThanh");
        
        Assert.assertNull(m.get(new PhoneNumber(90, 90, 90)));
    }

}
