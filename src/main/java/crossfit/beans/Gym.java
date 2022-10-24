package crossfit.beans;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Oct 13, 2022
 */

@Data
@NoArgsConstructor
@Entity
public class Gym {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOpened;
	
	@OneToMany(mappedBy = "gym", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
	private List<Coach> listOfCoaches;
	
	private boolean affiliated;
	
}