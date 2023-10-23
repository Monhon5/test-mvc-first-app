package com.example.testmvcfirstapp;

import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.namespace.QName;

@Controller

public class MyController {
    
    @GetMapping("/hello")
    public String showMyFirstPage(@RequestParam(name="name", required = false, defaultValue = "World")
                                  String NAME,
                                  Model model) {


        Object name = null;
        Object Ivan = new Object();
        model.addAttribute("name", Ivan);
        return "my-first-page";
    }
}
