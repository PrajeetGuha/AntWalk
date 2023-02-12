package org.nrifintech.bankingapp;

import org.nrifintech.bankingapp.models.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.nrifintech")
public class AppConfig {
    
    @Bean("saving")
    public Saving getSaving(){
        return new Saving();
    }
}
