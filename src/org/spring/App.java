package org.spring;
import org.spring.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeServ = ctx.getBean("shapeServ", ShapeService.class);
		//System.out.println(shapeServ.getCircle().getName());
		shapeServ.getCircle().setName("Name");
		//System.out.println(shapeServ.getTriangle().getName());
	}

}
