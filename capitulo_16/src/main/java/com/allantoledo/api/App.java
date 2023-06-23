package com.allantoledo.api;

//@author Allan Toledo
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static EntityManagerFactory factory;
    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory("livrariaPU");
        SpringApplication.run(App.class, args);
        //factory.close();
    }
}
