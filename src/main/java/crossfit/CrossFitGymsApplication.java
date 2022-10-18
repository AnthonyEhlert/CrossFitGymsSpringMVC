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
		
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
//		Gym g = appContext.getBean("gym", Gym.class);
		
//		System.out.println(g.toString());
		
	}
	
//	@Autowired
//	GymRepository repo;
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		//Use an existing bean
//		Gym g = appContext.getBean("gym", Gym.class);
//		g.setAffiliated(true);
//		g.setDateOpened(LocalDate.of(2010, 01, 01));
//		repo.save(g);
//		
//		//Creating a bean to use - not managed by Spring
//		Gym northAnkeny = new Gym("North Ankeny CrossFit", LocalDate.of(2012, 06, 10), false);
//		repo.save(northAnkeny);
//		
//		List<Gym> allGyms = repo.findAll();
//		for(Gym gyms: allGyms) {
//			System.out.println(gyms.toString());
//		}
//	}

}
