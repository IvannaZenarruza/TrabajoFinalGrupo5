package ar.edu.unju.edm.app.domain.controller;

import java.util.Base64;

import javax.validation.Valid;

import ar.edu.unju.edm.app.domain.services.StaffService;
import ar.edu.unju.edm.app.domain.util.constants.ViewKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.app.domain.model.Point;

@Controller
public class StaffController {

    @Autowired
    StaffService service;

    @Autowired
    Point point;

    @GetMapping("/staff")
    public ModelAndView init() {
        ModelAndView view = new ModelAndView();
        view.addObject(ViewKeys.POINT_LIST, service.getPointList());
        return view;
    }

    @GetMapping("/points/new")
    public ModelAndView setPoint() {
        ModelAndView view = new ModelAndView("setPoint");
        view.addObject(ViewKeys.POINT, point);
        return view;
    }
   
    @PostMapping(value="/points/new", consumes="multipart/form-data")
    public ModelAndView setPoint(@Valid @ModelAttribute(ViewKeys.POINT) Point point, @RequestParam("file") MultipartFile[] foto, BindingResult resultado) {
        ModelAndView modelAndView= new ModelAndView("redirect:/descubrir");
       if (resultado.hasErrors()){
            ModelAndView modelAndView2 = new ModelAndView ("setPoint");
            modelAndView2.addObject(ViewKeys.POINT, point);
            modelAndView2.addObject("band", false);
       return modelAndView2;
        }
        try{
            byte[] contenido=foto[0].getBytes();
            String base64= Base64.getEncoder().encodeToString(contenido);
            point.setPhoto(base64);
        service.addPoint(point);
        }catch(Exception e){
            modelAndView.addObject("Error", e.getMessage());
        }
        return modelAndView;
    }
    @GetMapping("/points/edit!{ID}")
    public ModelAndView editPoint(@PathVariable("ID") Integer ID) {
        ModelAndView view = new ModelAndView();
        view.addObject(ViewKeys.POINT, service.getPoint(ID));
        return view;
    }

    @GetMapping("/points/delete!{ID}")
    public ModelAndView deletePoint(@PathVariable("ID") Integer ID) {
        service.deletePoint(ID);
        return null;
    }

}