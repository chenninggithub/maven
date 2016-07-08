package com.lei.demo.controller;

import java.text.SimpleDateFormat;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.xml.crypto.Data;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/com")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
 
        model.addAttribute("message", "欢迎页面");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "hello";
    }
}