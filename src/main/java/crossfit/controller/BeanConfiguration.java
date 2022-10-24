package crossfit.controller;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import crossfit.beans.Certification;
import crossfit.beans.Coach;
import crossfit.beans.Gym;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Oct 13, 2022
 */

@Configuration
public class BeanConfiguration {

	@Bean
	public Gym gym() {
		Gym bean = new Gym();
//		bean.setName("CrossFit Ankeny");
//		bean.setDateOpened(LocalDate.of(2010, 01, 01));
//		bean.setAffiliated(true);
		return bean;
	}
	
	@Bean
	public Coach coach() {
		Coach bean = new Coach();
		return bean;
	}
	
	@Bean
	public Certification certification() {
		Certification bean = new Certification("No Cert. Name Provided", LocalDate.now(), LocalDate.now());
		return bean;
	}
}