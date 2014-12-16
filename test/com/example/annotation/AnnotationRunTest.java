package com.example.annotation;

import java.lang.reflect.Field;

import org.junit.Assert;
import org.junit.Test;

import com.example.annotation.AnnotationRun;
import com.example.annotation.Team;
import com.example.annotation.Teams;

public class AnnotationRunTest {

    @Test
    public void test() throws NoSuchFieldException, SecurityException {
        Class<AnnotationRun> annoClass = AnnotationRun.class;
        Team annoElement = annoClass.getAnnotation(Team.class);
        Assert.assertEquals("Team1",annoElement.value());
        
        Field field = annoClass.getField("teamName");
        Teams annoField = field.getAnnotation(Teams.class);
        Assert.assertEquals("Team2",annoField.value()[0].value());
        Assert.assertEquals("Team3",annoField.value()[1].value());
    }

}
