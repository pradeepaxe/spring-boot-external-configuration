package com.jpassion.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(MainApplication.class, args);
        
		MyBean1 bean1 = applicationContext.getBean(MyBean1.class);
        System.out.println(bean1);
        
		MyBean2 bean2 = applicationContext.getBean(MyBean2.class);
		System.out.println(bean2);
		
		MyBean3a bean3a = applicationContext.getBean(MyBean3a.class);
		System.out.println(bean3a);
		
		MyBean3b bean3b = applicationContext.getBean(MyBean3b.class);
		System.out.println(bean3b); 
		
		MyBean4Interface bean4 = applicationContext.getBean(MyBean4Interface.class);
		System.out.println(bean4); 

		MyBean5 bean5 = applicationContext.getBean(MyBean5.class);
		System.out.println(bean5); 
	}
}
