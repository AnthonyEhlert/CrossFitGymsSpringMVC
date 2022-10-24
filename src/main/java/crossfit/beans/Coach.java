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
	
	@ManyToOne(fetch = FetchType.EAGER, cascade= {CascadeType.MERGE})
	private Gym gym;
	
	@OneToMany(mappedBy = "coach", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
	private List<Certification> listOfCertifications;
	
	
//	//default no-arg constructor
//	public Coach() {
//		super();
//	}
//	
//	//helper constructors
//	public Coach(long id, String firstName, String lastName, Gym gym) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.gym = gym;
//	}
//	
//	public Coach(String firstName, String lastName, Gym gym) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.gym = gym;
//	}
//	
//	public Coach(String firstName, String lastName) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
//	
//	
//	//getters and setters
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public Gym getGym() {
//		return gym;
//	}
//
//	public void setGym(Gym gym) {
//		this.gym = gym;
//	}
//
//	public List<Certification> getListOfCertifications() {
//		return listOfCertifications;
//	}
//
//	public void setListOfCertifications(List<Certification> listOfCertifications) {
//		this.listOfCertifications = listOfCertifications;
//	}
//
//	@Override
//	public String toString() {
//		return "Coach [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gym=" + gym + "]";
//	}
	
}
