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

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Oct 18, 2022
 */

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
	
	@ManyToOne(fetch = FetchType.EAGER, cascade= {CascadeType.MERGE})
	private Coach coach;
	
	//default no-arg constructor
	public Certification() {
		super();
	}
	
	//helper constructors
	public Certification(long id, String name, LocalDate dateIssued, LocalDate dateExpires, Coach coach) {
		super();
		this.id = id;
		this.name = name;
		this.dateIssued = dateIssued;
		this.dateExpires = dateExpires;
		this.coach = coach;
	}
	
	public Certification(String name, LocalDate dateIssued, LocalDate dateExpires, Coach coach) {
		super();
		this.name = name;
		this.dateIssued = dateIssued;
		this.dateExpires = dateExpires;
		this.coach = coach;
	}
	
	public Certification(String name, LocalDate dateIssued, LocalDate dateExpires) {
		super();
		this.name = name;
		this.dateIssued = dateIssued;
		this.dateExpires = dateExpires;
	}

	//getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(LocalDate dateIssued) {
		this.dateIssued = dateIssued;
	}

	public LocalDate getDateExpires() {
		return dateExpires;
	}

	public void setDateExpires(LocalDate dateExpires) {
		this.dateExpires = dateExpires;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	@Override
	public String toString() {
		return "Certification [id=" + id + ", name=" + name + ", dateIssued=" + dateIssued + ", dateExpires="
				+ dateExpires + ", coach=" + coach + "]";
	}
	
	
	
}
