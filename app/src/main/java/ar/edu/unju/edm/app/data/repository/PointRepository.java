package ar.edu.unju.edm.app.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.app.domain.model.Point;

@Repository
public interface PointRepository extends CrudRepository <Point,Integer>{
    
}

