package ar.edu.unju.edm.app.data.source;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.app.data.repository.AccessRepository;
import ar.edu.unju.edm.app.domain.services.AccessService;
@Service
public class AccessDB implements AccessService{
    private final AccessRepository Database;
    public AccessDB(AccessRepository Database) {
    this.Database=Database;
    }
    @Override
    public void login(String email, String password) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Integer register() {
        // TODO Auto-generated method stub

        return null;
    }
  
}
