package client.apple;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationClient {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationClient.class, args);
        System.out.println("started client");
    }
}
