package com.jpassion.boot;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class MyBean1 {

	@Override
	public String toString() {
		return "Hello from MyBean1";
	}
}