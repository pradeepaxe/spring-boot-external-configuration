package com.jpassion.boot;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Profile("production")
public class MyBean4Production implements MyBean4Interface {

	@Override
	public String toString() {
		return "Hello from MyBean4Production";
	}
}