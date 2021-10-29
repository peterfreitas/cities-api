package com.github.peteroliveirafreitas.citiesapi.repository;

import com.github.peteroliveirafreitas.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
