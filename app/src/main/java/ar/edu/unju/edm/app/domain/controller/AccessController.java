package ar.edu.unju.edm.app.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccessController {
    @Autowired
    
    //Registro en la pagina
    @GetMapping
    public ModelAndView access (){
        ModelAndView view= new ModelAndView("register");
        return view;
    } 
    //Inicio de sesion en la pagina
    @GetMapping
    public ModelAndView login() {  
        ModelAndView view= new ModelAndView("login");
        return view;
    }
    @PostMapping
    public ModelAndView Access(){
        ModelAndView view= new ModelAndView("redirect:/login"); 
        return view;
    }
    @PostMapping 
    public ModelAndView Login(){
        ModelAndView view= new ModelAndView("redirect:/login");
        return view;
    }

}
