package com.amsidh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/beans-configuration/services-beans-configuration.xml");
		System.out.println(context.getBean("sessionFactory"));

	}

}
