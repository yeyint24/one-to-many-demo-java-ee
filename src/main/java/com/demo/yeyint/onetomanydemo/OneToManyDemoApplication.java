package com.demo.yeyint.onetomanydemo;

import com.demo.yeyint.onetomanydemo.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToManyDemoApplication {

        private  final IDatabase iDatabase;

    public OneToManyDemoApplication(IDatabase iDatabase) {
        this.iDatabase = iDatabase;
    }

    public static void main(String[] args) {
        SpringApplication.run(OneToManyDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(){
        return  args -> {
            iDatabase.createDatabase();
        };
    }

}
