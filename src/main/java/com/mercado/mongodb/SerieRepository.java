package com.mercado.mongodb;

import com.model.Serie;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SerieRepository extends MongoRepository<Serie, String> {

    public Serie findByCategory(String category);

}
