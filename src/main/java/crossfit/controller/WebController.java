package crossfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import crossfit.beans.Certification;
import crossfit.beans.Coach;
import crossfit.beans.Gym;
import crossfit.repository.CertificationRepository;
import crossfit.repository.CoachRepository;
import crossfit.repository.GymRepository;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Oct 18, 2022
 */

@Controller
public class WebController {

	@Autowired
	GymRepository gymRepo;
	
	@Autowired
	CoachRepository coachRepo;
	
	@Autowired
	CertificationRepository certRepo;
	
	@GetMapping("/viewAllGyms")
	public String viewAllGyms(Model model) {
		model.addAttribute("gyms", gymRepo.findAll());
		return "gymResults";
	}
	
	@GetMapping("inputGym")
	public String addNewGym(Model model) {
		Gym g = new Gym();
		model.addAttribute("newGym", g);
		return "inputGym";
	}
	
	@PostMapping("/inputGym")
	public String addNewGym(@ModelAttribute Gym g, Model model) {
		gymRepo.save(g);
		return viewAllGyms(model);
	}
	
	@GetMapping("/editGym/{id}")
	public String showUpdateGym(@PathVariable("id") long id, Model model) {
		Gym g = gymRepo.findById(id).orElse(null);
		model.addAttribute("newGym", g);
		return "inputGym";
	}
	
	@PostMapping("/updateGym/{id}")
	public String reviseGym(Gym g, Model model) {
		gymRepo.save(g);
		return viewAllGyms(model);
	}
	
	@GetMapping("/deleteGym/{id}")
	public String deleteGym(@PathVariable("id") long id, Model model) {
		Gym g = gymRepo.findById(id).orElse(null);
		gymRepo.delete(g);
		return viewAllGyms(model);
	}
	
	@GetMapping("/viewAllCoaches")
	public String viewAllCoaches(Model model) {
		model.addAttribute("coaches", coachRepo.findAll());
		return "coachResults";
	}
	
	@GetMapping("inputCoach")
	public String addNewCoach(Model model) {
		Coach c = new Coach();
		model.addAttribute("gyms", gymRepo.findAll());
		model.addAttribute("newCoach", c);
		return "inputCoach";
	}
	
	@PostMapping("/inputCoach")
	public String addNewCoach(@ModelAttribute Coach c, Model model) {
		coachRepo.save(c);
		return viewAllCoaches(model);
	}
	
	@GetMapping("/editCoach/{id}")
	public String showUpdateCoach(@PathVariable("id") long id, Model model) {
		//model.addAttribute("gyms", gymRepo.findAll());
		Coach c = coachRepo.findById(id).orElse(null);
		model.addAttribute("newCoach", c);
		return "inputCoach";
	}
	
	@PostMapping("/updateCoach/{id}")
	public String reviseCoach(Coach c, Model model) {
		coachRepo.save(c);
		return viewAllCoaches(model);
	}
	
	@GetMapping("/deleteCoach/{id}")
	public String deleteCoach(@PathVariable("id") long id, Model model) {
		Coach c = coachRepo.findById(id).orElse(null);
		coachRepo.delete(c);
		return viewAllCoaches(model);
	}
	
	@GetMapping("/viewAllCertifications")
	public String viewAllCertifications(Model model) {
		model.addAttribute("certifications", certRepo.findAll());
		return "certResults";
	}
	
	@GetMapping("inputCertification")
	public String addNewCertification(Model model) {
		Certification cert = new Certification();
		model.addAttribute("newCertification", cert);
		return "inputCertification";
	}
	
	@PostMapping("/inputCertification")
	public String addNewCertification(@ModelAttribute Certification cert, Model model) {
		certRepo.save(cert);
		return viewAllCertifications(model);
	}
	
	@GetMapping("/editCertification/{id}")
	public String showUpdateCertification(@PathVariable("id") long id, Model model) {
		Certification cert = certRepo.findById(id).orElse(null);
		model.addAttribute("newCertification", cert);
		return "inputCertification";
	}
	
	@PostMapping("/updateCertification/{id}")
	public String reviseCertification(Certification cert, Model model) {
		certRepo.save(cert);
		return viewAllCertifications(model);
	}
	
	@GetMapping("/deleteCertification/{id}")
	public String deleteCertification(@PathVariable("id") long id, Model model) {
		Certification cert = certRepo.findById(id).orElse(null);
		certRepo.delete(cert);
		return viewAllCertifications(model);
	}
	
}
