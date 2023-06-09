package ar.edu.unju.edm.app.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.app.domain.model.User;

@Repository
public interface AccessRepository extends CrudRepository <User, Integer>{
    
}


