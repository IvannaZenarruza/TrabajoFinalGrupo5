package ar.edu.unju.edm.app.domain.controller;

import ar.edu.unju.edm.app.domain.util.constants.ViewKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.app.domain.model.Point;
import ar.edu.unju.edm.app.domain.model.User;
import ar.edu.unju.edm.app.domain.services.AdminService;

@Controller
public class AdminController {

    @Autowired
    AdminService service;

    @GetMapping("/administration")
    public ModelAndView init() {
        ModelAndView view = new ModelAndView("admin");
        view.addObject(ViewKeys.USER_LIST, service.getUserList());
        view.addObject(ViewKeys.POINT_LIST, service.getPointList());
        return view;
    }

}