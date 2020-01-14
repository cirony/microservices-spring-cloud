package com.mswspringcloud.lab1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mswspringcloud.lab1.entities.Player;
import com.mswspringcloud.lab1.entities.Team;
import com.mswspringcloud.lab1.repositories.TeamRepository;

@SpringBootApplication
public class Lab1Application {

	@Autowired
	private TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

	@PostConstruct
	public void init() {
		List<Team> teams = new ArrayList<>();

		Set<Player> players1 = new HashSet<>();
		players1.add(new Player("Harold", 1));
		players1.add(new Player("Denis", 2));

		teams.add(new Team("Team1", "Arg", "Pepper", players1));

		Set<Player> players2 = new HashSet<>();
		players2.add(new Player("Chris", 1));
		players2.add(new Player("Marco", 2));

		teams.add(new Team("Team2", "Bra", "Macaco", players2));
		teams.add(new Team("Team3", "Per", "Gallo", null));

		teamRepository.saveAll(teams);
	}

}
