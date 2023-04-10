package org.example.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.demo.Customer;

@Configuration
public class SpringConfig {
@Bean
    public Customer customer(){
        return new Customer();
    }
}
