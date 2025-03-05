package com.example.HelloApp;

import com.example.HelloApp.model.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloAppApplication.class, args);

		// Retrieve EmployeeBean from ApplicationContext (IoC Demonstration)
		EmployeeBean employee = context.getBean(EmployeeBean.class);
		System.out.println("IoC Container Managed Bean: " + employee.getEmployeeDetails());
	}
}
