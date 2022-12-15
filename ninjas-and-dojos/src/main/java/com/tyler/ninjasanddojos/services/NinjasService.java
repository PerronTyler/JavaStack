package com.tyler.ninjasanddojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tyler.ninjasanddojos.models.Ninja;
import com.tyler.ninjasanddojos.repositories.NinjaRepository;

@Service
public class NinjasService {

	private final NinjaRepository ninjaRepo;
	public NinjasService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public List<Ninja> getAll(){
		return ninjaRepo.findAll();
	}
	public Ninja create(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public Ninja getNinja(Long id) {
		Optional<Ninja> potentialNinja = ninjaRepo.findById(id);
		return potentialNinja.isPresent() ? potentialNinja.get() : null;
	}
	public Ninja getNinja(String firstName) {
		Optional<Ninja> potentialNinja = ninjaRepo.findByFirstName(firstName);
		return potentialNinja.isPresent() ? potentialNinja.get() : null;
	}
}
