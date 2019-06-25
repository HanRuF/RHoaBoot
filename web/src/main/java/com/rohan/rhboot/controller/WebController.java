package com.rohan.rhboot.controller;

import com.rohan.rhboot.service.IVnewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WebController {

    @Autowired
    private IVnewsService ivnewSvc;

    @RequestMapping("/")
    public  String view(Model m){
   System.out.println("ddd");
        m.addAttribute("name","dddd");
        return "webindex";
    }


}
