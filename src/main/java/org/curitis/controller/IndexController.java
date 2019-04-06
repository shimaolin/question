package org.curitis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/world")
    public String world(){
        return "Hello World!";
    }

    @RequestMapping("/")
    public String index(){
        return "redirect:/type/";
    }

}
