package crossfit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crossfit.beans.Coach;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Oct 19, 2022
 */

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {
	
}
