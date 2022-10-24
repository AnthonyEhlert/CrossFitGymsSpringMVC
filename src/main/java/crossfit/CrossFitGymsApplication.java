package crossfit;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import crossfit.beans.Gym;
import crossfit.controller.BeanConfiguration;
import crossfit.repository.GymRepository;

@SpringBootApplication
public class CrossFitGymsApplication{

	public static void main(String[] args) {
		SpringApplication.run(CrossFitGymsApplication.class, args);
	}
}
