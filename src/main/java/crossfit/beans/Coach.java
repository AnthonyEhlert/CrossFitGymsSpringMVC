package crossfit.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name= "coach")
public class Coach {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String firstName;
	private String lastName;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Gym gym;
	
	@OneToMany(mappedBy = "coach", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
	private List<Certification> listOfCertifications;
	
	//toString modified to pull gym id instead of object.
	@Override
	public String toString() {
		return "Coach [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gym=" + gym.getId() + "]";
	}
	
}
