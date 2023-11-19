package com.coldrenatinho.lbd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VehicleTypeWeb {

    @RequestMapping(method = RequestMethod.GET, value = "/vehicle_type")
    public ModelAndView VehicleTypeWeb(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("VehicleType.html");
        return modelAndView;
    }

}
