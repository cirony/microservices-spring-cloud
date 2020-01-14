package com.mswspringcloud.lab1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mswspringcloud.lab1.entities.Team;
import com.mswspringcloud.lab1.repositories.TeamRepository;

//@RestController
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;

	@GetMapping("/teams")
	private Iterable<Team> getTeams() {

		return teamRepository.findAll();
	}
	
	@GetMapping("/teams/{id}")
	private Team getTeam(@PathVariable Long id) {

		return teamRepository.findById(id).get();
	}
}
