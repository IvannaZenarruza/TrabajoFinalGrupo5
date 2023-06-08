package ar.edu.unju.edm.app.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping
    public ModelAndView add() {
        return null;
    }

    @GetMapping
    public ModelAndView getListPoint() {
        ModelAndView view = new ModelAndView("getListPoint");
        return view;
    }

    @GetMapping
    ModelAndView modifyPoint() {
        ModelAndView view = new ModelAndView("modifyPoint");
        return view;
    }

    @GetMapping
    ModelAndView deleteTurist() {
        ModelAndView view = new ModelAndView("deleteTurist");
        return view;
    }
}
