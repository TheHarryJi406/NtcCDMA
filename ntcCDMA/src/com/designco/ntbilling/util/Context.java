package com.designco.ntbilling.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Context {
	static ApplicationContext context;
	
	public static ApplicationContext get() {
		if (context == null) {
			context = new ClassPathXmlApplicationContext("spring2.xml");
		}
		return context;
	}
}
