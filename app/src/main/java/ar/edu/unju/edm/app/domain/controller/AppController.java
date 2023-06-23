package ar.edu.unju.edm.app.domain.controller;

import ar.edu.unju.edm.app.domain.model.Comment;
import ar.edu.unju.edm.app.domain.model.Review;
import ar.edu.unju.edm.app.domain.services.AppService;
import ar.edu.unju.edm.app.domain.util.constants.ViewKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    AppService service;

    @GetMapping({"/", "/home"})
    public ModelAndView initHome() {
        return new ModelAndView("home");
    }

    @GetMapping("/explorer")
    public ModelAndView showExplorer() {
        ModelAndView view = new ModelAndView("explorer");
        view.addObject(ViewKeys.POINT_LIST, service.getPointList());
        return view;
    }

}