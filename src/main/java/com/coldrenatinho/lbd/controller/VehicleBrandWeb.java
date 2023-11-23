package com.coldrenatinho.lbd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@CrossOrigin(origins = "*")
@Controller
public class VehicleBrandWeb {

    @RequestMapping(method = RequestMethod.GET, value = "/vehicle-brand")
    public ModelAndView VehicleBrandWeb(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("VehicleBrand.html");
        return modelAndView;
    }
}
