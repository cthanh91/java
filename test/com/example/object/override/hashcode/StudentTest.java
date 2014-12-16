package com.example.object.override.hashcode;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void test() {
        Map<Student, String> m = new HashMap<>();
        Date date = new Date();
        float[] pointPerYear = { 8.01f, 8.02f };
        Course course = new Course(2014);
        Student student1 = new Student(1, "CThanh", date, 8.00d, false, pointPerYear, course);
        m.put(student1, "CThanh");

        Student student2 = new Student(1, "CThanh", date, 8.00d, false, pointPerYear, course);
        Assert.assertNotNull(m.get(student2));
        Assert.assertEquals("CThanh", m.get(student2));
    }

}
