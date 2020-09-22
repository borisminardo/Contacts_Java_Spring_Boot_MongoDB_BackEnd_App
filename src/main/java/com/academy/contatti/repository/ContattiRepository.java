package com.academy.contatti.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.academy.contatti.model.Contatto;

public interface ContattiRepository extends MongoRepository<Contatto, String> {

}
