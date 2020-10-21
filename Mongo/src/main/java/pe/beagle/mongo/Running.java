package pe.beagle.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Running {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(Running.class, args);
        app.getBean();
    }
}
