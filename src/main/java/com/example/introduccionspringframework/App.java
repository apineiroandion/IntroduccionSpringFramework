package com.example.introduccionspringframework;

import com.example.introduccionspringframework.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// @ComponentScan(basePackages = {"com.example", "com.example2"}) Si tuvieramos que escanear mas de un paquete
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		EmployeeController employeeController = context.getBean(EmployeeController.class);

		System.out.println(employeeController.hello());
		System.out.println(employeeController.helloCustomer());

	}

}
