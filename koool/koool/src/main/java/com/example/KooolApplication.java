package com.example;


import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KooolApplication {

    public static void main(String[] args) {
        SpringApplication.run(KooolApplication.class, args);
    }

    @Bean
    public CommandLineRunner lineRunner(Servicestudent servicestudent, EntityManagerFactory emf) {
        return args -> servicestudent.save(emf);



    }
}


