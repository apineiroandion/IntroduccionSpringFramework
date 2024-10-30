package com.example.introduccionspringframework.controller;

import com.example.introduccionspringframework.primary.CustomerService;
import com.example.introduccionspringframework.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
     //@Autowired //Inyeccion de dependencias, se encarga de instanciar la clase
    private EmployeeService employeeService;

    //@Autowired
    //En lugar de primary en CustomerA tambien se puede usar
    //@Qualifier("customerAServiceImpl") //Se usa para indicar que clase se va a inyectar
     private CustomerService customerService;

     //Si se hace el constructor con los parametros de las clases, se puede omitir el @Autowired
    public EmployeeController(EmployeeService employeeService, CustomerService customerService) {
        this.employeeService = employeeService;
        this.customerService = customerService;
    }

    //Es comun que una clase delegen otra ciertas responsbiliades
    public String hello(){
        return this.employeeService.hello();
    }

    public String helloCustomer(){
        return this.customerService.hello();
    }
}
