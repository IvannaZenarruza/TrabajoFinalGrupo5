package ar.edu.unju.edm.app.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.app.domain.model.User;

@Controller
public class AccessController {
    @Autowired
    User Turist;
    //Registro en la pagina
    @GetMapping("/register")
    public ModelAndView access (){
        ModelAndView view= new ModelAndView("register");
        view.addObject("Turista", Turist);
        return view;
    } 
    //Inicio de sesion en la pagina
    @GetMapping("/login")
    public ModelAndView login() {  
        ModelAndView view= new ModelAndView("login");
          view.addObject("Turista", Turist);
        return view;
    }
    @PostMapping
    public ModelAndView Access(@PathVariable("Turista") User Turist){
        ModelAndView view= new ModelAndView("redirect:/login"); 
        return view;
    }
    @PostMapping 
    public ModelAndView Login(@PathVariable("Turista") User Turist){
        ModelAndView view= new ModelAndView("redirect:/login");
        return view;
    }

}
