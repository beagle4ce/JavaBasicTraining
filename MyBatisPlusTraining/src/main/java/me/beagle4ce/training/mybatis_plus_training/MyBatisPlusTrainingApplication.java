package me.beagle4ce.training.mybatis_plus_training;

import me.beagle4ce.training.mybatis_plus_training.services.SchooleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyBatisPlusTrainingApplication {

	public static void main(String[] args) {
		ApplicationContext apx = SpringApplication.run(MyBatisPlusTrainingApplication.class, args);
		SchooleService schooleService = apx.getBean(SchooleService.class);
//		schooleService.saveTest();
		schooleService.delTest();
	}

}
