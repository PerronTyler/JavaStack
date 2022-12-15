package com.tyler.ninjasanddojos.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tyler.ninjasanddojos.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	Optional<Dojo> findByName(String name);
	List<Dojo> findAll();
}
