package com.github.peteroliveirafreitas.citiesapi.states.repository;

import com.github.peteroliveirafreitas.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
