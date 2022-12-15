package com.tyler.ninjasanddojos.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tyler.ninjasanddojos.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	Optional<Ninja> findByFirstName(String firstName);
	List<Ninja> findAll();
}
