package com.academy.contatti.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academy.contatti.model.Contatto;
import com.academy.contatti.repository.ContattiRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://127.0.0.1:4200", allowedHeaders = "*")
public class ContattiRestController {
	
	@Autowired
	private ContattiRepository contattiRepository;
	
	@GetMapping("/contatti")
	public List<Contatto> getContatti(){
		return contattiRepository.findAll();
	}
	
	@GetMapping("/contatto/{id}")
	public Contatto getContatto(@PathVariable String id) {
		return(Contatto) contattiRepository.findById(id).get();
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteContatto(@PathVariable String id) {
		contattiRepository.deleteById(id);
		return true;
	}
	
	@PostMapping("/save")
	public Contatto saveContatto(@RequestBody Contatto contatto) {
		return contattiRepository.save(contatto);
	}
	
	@PutMapping("/update")
	public Contatto updateContatto(@RequestBody Contatto contatto) {
		return contattiRepository.save(contatto);
	}
}
