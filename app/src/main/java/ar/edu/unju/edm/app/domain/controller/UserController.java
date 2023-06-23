package ar.edu.unju.edm.app.domain.controller;

import ar.edu.unju.edm.app.domain.model.Comment;
import ar.edu.unju.edm.app.domain.model.Favorite;
import ar.edu.unju.edm.app.domain.model.Like;
import ar.edu.unju.edm.app.domain.model.Review;
import ar.edu.unju.edm.app.domain.services.UserService;
import ar.edu.unju.edm.app.domain.util.constants.ViewKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    UserService service;

    @Autowired
    Comment comment;
    @Autowired
    Review review;

    @GetMapping("/accounts/edit!{ID}")
    public ModelAndView editUser(@PathVariable("ID") Integer ID) {
        return null;
    }

    @PostMapping("/accounts/delete!{ID}")
    public ModelAndView deleteUser(@PathVariable("ID") Integer ID) {
        return null;
    }

    @GetMapping("/points/details!{ID}")
    public ModelAndView showPoint(@PathVariable("ID") Integer ID) {
        ModelAndView view = new ModelAndView("");
        // View Objects
        view.addObject(ViewKeys.POINT, service.getPoint(ID));
        view.addObject(ViewKeys.COMMENT_LIST, "");
        // POST Objects
        view.addObject(ViewKeys.COMMENT, comment);
        view.addObject(ViewKeys.REVIEW, review);
        return view;
    }

    @PostMapping("/point/comment!{ID}")
    public ModelAndView addComment( @ModelAttribute(ViewKeys.COMMENT) Comment comment) {
        service.addComment(comment);
        return null;
    }

    @PostMapping("/point/review!{ID}")
    public ModelAndView addReview(@ModelAttribute(ViewKeys.REVIEW) Review review) {
        service.addReview(review);
        return null;
    }

}