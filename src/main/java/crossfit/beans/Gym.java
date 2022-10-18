package crossfit.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Oct 13, 2022
 */

@Entity
public class Gym {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOpened;
	
	private boolean affiliated;
	
	
	//default no arg constructor
	public Gym() {
		super();
		this.dateOpened = LocalDate.now();
	}
	
	//helper constructors
	public Gym(int id, String name, LocalDate dateOpened, boolean affiliated) {
		super();
		this.id = id;
		this.name = name;
		this.dateOpened = dateOpened;
		this.affiliated = affiliated;
	}
	
	public Gym(String name, LocalDate dateOpened, boolean affiliated) {
		super();
		this.name = name;
		this.dateOpened = dateOpened;
		this.affiliated = affiliated;
	}
	
	public Gym(String name) {
		super();
		this.name = name;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOpened() {
		return dateOpened;
	}

	public void setDateOpened(LocalDate dateOpened) {
		this.dateOpened = dateOpened;
	}

	public boolean getAffiliated() {
		return affiliated;
	}

	public void setAffiliated(boolean affiliated) {
		this.affiliated = affiliated;
	}

	@Override
	public String toString() {
		return "Gym [id=" + id + ", name=" + name + ", dateOpened=" + dateOpened + ", affiliated=" + affiliated + "]";
	}
	
}