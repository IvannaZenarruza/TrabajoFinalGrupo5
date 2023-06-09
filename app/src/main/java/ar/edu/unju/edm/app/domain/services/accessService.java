package ar.edu.unju.edm.app.domain.services;

import org.springframework.stereotype.Service;

@Service
public interface AccessService {
    public Integer login (String email, String password);
    public Integer register ();
}

