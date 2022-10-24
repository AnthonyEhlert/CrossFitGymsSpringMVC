package crossfit.beans;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Oct 18, 2022
 */

@Data
@NoArgsConstructor
@Entity
public class Certification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateIssued;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateExpires;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Coach coach;
	

	@Override
	public String toString() {
		return "Certification [id=" + id + ", name=" + name + ", dateIssued=" + dateIssued + ", dateExpires="
				+ dateExpires + ", coach=" + coach.getId() + "]";
	}
	
	
	
}
