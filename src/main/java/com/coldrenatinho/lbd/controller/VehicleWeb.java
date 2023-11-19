package com.coldrenatinho.lbd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VehicleWeb {

    @RequestMapping(method = RequestMethod.GET, value = "/vehicle")
    public ModelAndView VehicleWeb(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("VehicleWeb.html");
        return modelAndView;
    }

}
