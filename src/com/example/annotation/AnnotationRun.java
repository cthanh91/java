package com.example.annotation;

import java.lang.reflect.Field;

@Team("Team1")
public class AnnotationRun {

	@Teams({@Team("Team2"),@Team("Team3")})
	public String teamName;

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<AnnotationRun> annoClass =  AnnotationRun.class;
		Field field = annoClass.getField("teamName");
		
		Team annoElement = annoClass.getAnnotation(Team.class);
		System.out.println(annoElement.value());
		Teams annoField = field.getAnnotation(Teams.class);
		for (Team anno : annoField.value()) {
			System.out.println(anno.value());
		}
	}
}
