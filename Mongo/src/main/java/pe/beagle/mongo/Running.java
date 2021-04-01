package pe.beagle.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import pe.beagle.mongo.services.MongoTestService;

@EnableConfigurationProperties
@SpringBootApplication
public class Running {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(Running.class, args);
        MongoTestService service = app.getBean(MongoTestService.class);
        service.insert();
    }
}
