package ar.edu.unju.edm.app.data.source;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.app.data.repository.AccessRepository;
import ar.edu.unju.edm.app.domain.model.User;
import ar.edu.unju.edm.app.domain.services.AccessService;
@Service
public class AccessDB implements AccessService{
    private final AccessRepository Database;
    public AccessDB(AccessRepository Database) {
    this.Database=Database;
    }
    @Override
    public Integer login(String email, String password) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer register() {
        // TODO Auto-generated method stub

        return null;
    }
    @Override
    public void deleteUser(Integer ID) {
       Database.deleteById(ID);
        
    }
    @Override
    public void modifyUser(User Turista) {
        Database.save(Turista);
    }
}
