package server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationApi {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationApi.class, args);
        System.out.println("started server");
    }
}
