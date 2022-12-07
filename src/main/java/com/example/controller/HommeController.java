package com.example.controller;

import com.example.model.Students;
import com.example.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
public class HommeController {

    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping( value = {"/"}, method = RequestMethod.GET)
    public String Login(Map<String,Object> model){
        model.put("users",new Students());
        return "login";
    }

    @PostMapping("/save")
    public String login(@ModelAttribute Students students){
        List<Students> studentsList = productService.CheckLogin(students);
        if (studentsList.isEmpty()){
            return "login";
        }
        else
            return "home";
    }

}
