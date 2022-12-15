package com.tyler.ninjasanddojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tyler.ninjasanddojos.models.Dojo;
import com.tyler.ninjasanddojos.repositories.DojoRepository;

@Service
public class DojoService {

	private final DojoRepository dojoRepo;
		public DojoService(DojoRepository dojoRepo) {
			this.dojoRepo = dojoRepo;
		}
		
		public List<Dojo> getAll(){
			return dojoRepo.findAll();
		}
		public Dojo create(Dojo dojo) {
			return dojoRepo.save(dojo);
		}
		public Dojo getDojo(Long id) {
			Optional<Dojo> potentialDojo = dojoRepo.findById(id);
			return potentialDojo.isPresent() ? potentialDojo.get() : null;
		}
		public Dojo getDojo(String name) {
			Optional<Dojo> potentialDojo = dojoRepo.findByName(name);
			return potentialDojo.isPresent() ? potentialDojo.get() : null;
		}

}
