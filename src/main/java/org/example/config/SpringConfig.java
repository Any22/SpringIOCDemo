package org.example.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.dto.Customer;

@Configuration
public class SpringConfig {
@Bean
    public Customer customer(){
        return new Customer();
    }
}
