package com.example.object.override.hashcode;

import java.util.Arrays;
import java.util.Date;

/**
 * Student class have overridden hashCode() method
 * so it works properly when using it in hashMap
 * 
 * @author CThanh
 *
 */
public class Student {

    private int INITIAL_NUMBER = 31;

    public long id;
    public String name;
    public Date dateOfBirth;
    public double grade;
    public boolean isGraduated;
    public float[] pointPerYears;
    public Course course;

    public Student(long id, String name, Date dateOfBirth, double grade, boolean isGraduated, float[] pointPerYears,Course course) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.grade = grade;
        this.isGraduated = isGraduated;
        this.pointPerYears = pointPerYears;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student))
            return false;
        Student student = (Student) o;
        return student.id == id && student.dateOfBirth.equals(dateOfBirth) && student.name == name
                && student.isGraduated == isGraduated
                && (student.course == null ? course == null : student.course.equals(course))
                && Double.compare(student.grade, grade) == 0 && Arrays.equals(student.pointPerYears, pointPerYears);

    }

    @Override
    public int hashCode() {
        int result = 0;
        result = INITIAL_NUMBER * result + (int) (id ^ (id >>> 32));
        result = INITIAL_NUMBER * result + dateOfBirth.hashCode();
        result = INITIAL_NUMBER * result + name.hashCode();
        result = INITIAL_NUMBER * result + (isGraduated ? 1 : 0);
        result = INITIAL_NUMBER * result + course.hashCode();
        long gradeInLongType = Double.doubleToLongBits(grade);
        result = INITIAL_NUMBER * result + (int) (gradeInLongType ^ (gradeInLongType >>> 32));
        result = INITIAL_NUMBER + result + Arrays.hashCode(pointPerYears);
        return result;
    }

}
