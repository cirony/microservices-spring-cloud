package com.mswspringcloud.lab1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mswspringcloud.lab1.entities.Player;

@RestResource(path = "/players", rel = "player")
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
