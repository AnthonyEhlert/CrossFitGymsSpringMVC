package crossfit;

import java.util.List;

import crossfit.beans.Gym;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Oct 21, 2022
 */
public class GymsList {

	private List<Gym> gyms;
	
	public void addGym(Gym gym) {
		this.gyms.add(gym);
	}

	public List<Gym> getGyms() {
		return gyms;
	}

	public void setGyms(List<Gym> gyms) {
		this.gyms = gyms;
	}
	
	
}
