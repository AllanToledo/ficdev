package com.allantoledo.main;
<<<<<<< HEAD

=======
>>>>>>> 0ed9086e74b321bc6337c79d6bdd3f4610cff152

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.allantoledo.*")
@ComponentScan(basePackages = {"com.allantoledo.*"})
@EntityScan("com.allantoledo.*")
public class ProjetocompletoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetocompletoApplication.class, args);
    }
}
