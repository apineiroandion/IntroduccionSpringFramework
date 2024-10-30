package com.example.introduccionspringframework.config;

import com.example.introduccionspringframework.primary.CustomerAServiceImpl;
import com.example.introduccionspringframework.primary.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    /*
    Esta opcion se utiliza para configurar clases que provienen de frameworks externos
     */

//    @Bean
//    public CustomerService customerService() {
//        return new CustomerAServiceImpl();
//    }
}
