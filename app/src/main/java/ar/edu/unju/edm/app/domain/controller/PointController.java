package ar.edu.unju.edm.app.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PointController {

@GetMapping
public ModelAndView addPoint(){
    ModelAndView view = new ModelAndView("addPoint");
        return view;
}
@GetMapping
public ModelAndView modifyPoint(){
    ModelAndView view = new ModelAndView("modifyPoint");
    return view;
}
@GetMapping
public ModelAndView deletePoint(){
    ModelAndView view = new ModelAndView("deletePoint");
    return view;
}
@GetMapping
public ModelAndView addComment(){
    ModelAndView view = new ModelAndView("addComment");
        return view;
}
@GetMapping
public ModelAndView getPoint(){
    ModelAndView view = new ModelAndView("getPoint");
    return view;
}

}