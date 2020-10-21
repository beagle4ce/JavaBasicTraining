package pe.beagle.jpa.jpacasecadetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pe.beagle.jpa.jpacasecadetest.services.TestService;

@SpringBootApplication
public class JpaCasecadeTestApplication {



	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(JpaCasecadeTestApplication.class, args);
		TestService testService = run.getBean(TestService.class);
		testService.o2mUpdate();

		System.out.println("===finished===");
	}

}
