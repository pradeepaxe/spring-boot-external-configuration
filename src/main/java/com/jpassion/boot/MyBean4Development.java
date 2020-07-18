package com.jpassion.boot;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Profile("development")
public class MyBean4Development implements MyBean4Interface {

	@Override
	public String toString() {
		return "Hello from MyBean4Development";
	}
}