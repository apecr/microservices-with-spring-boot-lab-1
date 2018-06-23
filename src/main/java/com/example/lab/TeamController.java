package com.example.lab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@RestController
public class TeamController {
	
	@Autowired
	private TeamRepository teamRepository;
	
	@GetMapping("/teams")
	public List<Team> getTeams(){
	  	return teamRepository.findAll();
	}
	
	@GetMapping("/teams/{id}")
	public Team getTeamById(@PathVariable Long id) {
		return teamRepository.findById(id).get();
	}
}
