package ar.edu.unju.edm.app.data.source;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.app.data.repository.PointRepository;
import ar.edu.unju.edm.app.domain.model.Point;
import ar.edu.unju.edm.app.domain.services.PointService;

@Service
public class PointDB implements PointService {
   private final PointRepository Database;
   public PointDB(PointRepository Database){
    this.Database = Database;
   }
    @Override
    public void addPoint(Point point) {
        Database.save(point);
    }

    @Override
    public void commentPoint(Integer ID, String text) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deletePoint(Integer ID) {
        Database.deleteById(ID);
    }


    @Override
    public Point getPoint(Integer ID) {
        return Database.findById(ID).get();
    }

    @Override
    public void modifyPoint(Point item) {
        // TODO Auto-generated method stub
        
    }
    
}
