package us.icarenow.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
//        System.out.println(new BCryptPasswordEncoder().encode("pascal"));
        SpringApplication.run(Application.class,args);
    }
}