package ar.edu.unju.edm.app.domain.controller;

import ar.edu.unju.edm.app.domain.util.CountryList;
import ar.edu.unju.edm.app.domain.util.constants.ViewKeys;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.app.domain.model.User;
import ar.edu.unju.edm.app.domain.services.AuthService;

@Controller
public class AuthController {

    @Autowired
    AuthService service;

    @Autowired
    User user;

    @GetMapping("/accounts/new")
    public ModelAndView SignUp() {
        ModelAndView view = new ModelAndView("signup");
        view.addObject(ViewKeys.USER, user);
        view.addObject(ViewKeys.COUNTRY_LIST, CountryList.get());
        return view;
    }

    @PostMapping("/accounts/new")
    public ModelAndView SignUp(@Valid @ModelAttribute(ViewKeys.USER) User user, BindingResult resultado) {
    if (resultado.hasErrors()){
    ModelAndView modelAndView = new ModelAndView ("sigup");
    modelAndView.addObject(ViewKeys.USER, user);
    modelAndView.addObject("band", false);
    return modelAndView;
    }
        try {
            service.addUser(user);
            return null;
        } catch (Exception e) {
            return new ModelAndView("redirect:/error/signup");
        }
    }

    @GetMapping("/login")
    public ModelAndView SignIn() {
        ModelAndView view = new ModelAndView("signin");
        view.addObject(ViewKeys.USER, user);
        return view;
    }

    /*@PostMapping("/login")
    public ModelAndView SignIn(@PathVariable(ViewKeys.USER) User user) {
        try {
            if (user != null) {
                return new ModelAndView("redirect:/admin");
            }
            return new ModelAndView("redirect:/explorer");
        } catch (Exception e) {
            ModelAndView view = new ModelAndView("redirect:/error/signin");
            view.addObject("error", e);
            return view;
        }
    }*/

}