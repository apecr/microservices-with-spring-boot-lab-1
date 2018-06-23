package com.example.lab;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicesBootLabApplication {

	@Autowired
	private TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootLabApplication.class, args);
	}

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotters");

		team = new Team();
		team.setLocation("Washington");
		team.setName("Generals");

		List<Player> set = new ArrayList<>();
		set.add(new Player("Big Easy", "Showman"));
		set.add(new Player("Buckets", "Guard"));
		set.add(new Player("Dizzy", "Guard"));

		list.add(new Team("Harlem", "Globetrotters", set, "Snoopy"));
		list.add(new Team("Washington", "Generals", null, "Wizard"));

		teamRepository.saveAll(list);
	}
}
