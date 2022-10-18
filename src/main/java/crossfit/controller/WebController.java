package crossfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import crossfit.beans.Gym;
import crossfit.repository.GymRepository;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Oct 18, 2022
 */

@Controller
public class WebController {

	@Autowired
	GymRepository repo;
	
	@GetMapping("/viewAllGyms")
	public String viewAllGyms(Model model) {
		model.addAttribute("gyms", repo.findAll());
		return "gymresults";
	}
	
	@GetMapping("inputGym")
	public String addNewGym(Model model) {
		Gym g = new Gym();
		model.addAttribute("newGym", g);
		return "inputGym";
	}
	
	@PostMapping("/inputGym")
	public String addNewGym(@ModelAttribute Gym g, Model model) {
		repo.save(g);
		return viewAllGyms(model);
	}
	
	@GetMapping("/editGym/{id}")
	public String showUpdateGym(@PathVariable("id") long id, Model model) {
		Gym g = repo.findById(id).orElse(null);
		model.addAttribute("newGym", g);
		return "inputGym";
	}
	
	@PostMapping("/update/{id}")
	public String reviseGym(Gym g, Model model) {
		repo.save(g);
		return viewAllGyms(model);
	}
	
}
