package ar.edu.unju.edm.app.data.repository;

import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.edm.app.domain.model.Review;

public interface ReviewRepository extends CrudRepository<Review, Integer> {
    
}