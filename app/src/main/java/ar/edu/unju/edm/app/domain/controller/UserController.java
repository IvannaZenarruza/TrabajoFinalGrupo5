package ar.edu.unju.edm.app.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/listPoint")
    public ModelAndView getListPoint() {
        ModelAndView view = new ModelAndView("getListPoint");
        return view;
    }

    @GetMapping("/modifyPoint")
    ModelAndView modifyPoint() {
        ModelAndView view = new ModelAndView("modifyPoint");
        return view;
    }

    @GetMapping("/delete/{ID}")
    ModelAndView deleteTurist(@PathVariable("ID") Integer ID) {
        ModelAndView view = new ModelAndView("redirect:/listPoint");
        return view;
    }
}
