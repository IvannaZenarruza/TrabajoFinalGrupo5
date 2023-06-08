package ar.edu.unju.edm.app.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.app.domain.model.Point;
import ar.edu.unju.edm.app.domain.model.User;

@Service
public interface UserService {
    public List <User> getListUsers ();
    public List <Point> getListPoints ();
}

