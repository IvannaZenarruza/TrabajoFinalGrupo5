package ar.edu.unju.edm.app.domain.services;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.app.domain.model.User;

@Service
public interface AccessService {
    public Integer login(String email, String password);

    public Integer register();

    public void deleteUser(Integer ID);

    public void modifyUser(User Turista);
}