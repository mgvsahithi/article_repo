package api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages= {"api.bo","api.controller"})


public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}