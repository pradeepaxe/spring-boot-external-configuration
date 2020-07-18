package com.jpassion.boot;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;
import org.springframework.beans.factory.annotation.Value;

@Component
public class MyBean2 {

	@Value("${name}")
	private String name;
	
	@Value("${age}")
	private int age;
	
	@Override
	public String toString() {
		return String.format("My name is %s and I am %d years old.", name, age);
	}
}