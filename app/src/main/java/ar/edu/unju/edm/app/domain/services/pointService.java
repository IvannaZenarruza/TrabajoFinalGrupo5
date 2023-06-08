package ar.edu.unju.edm.app.domain.services;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.app.domain.model.Point;

@Service
public interface PointService {
    public void addPoint();
    public void deletePoint (Integer ID);
    public void modifyPoint (Point item);
    public Point getPoint (Integer ID);
    public void commentPoint (Integer ID, String text);
}