package kr.hs.study.UrlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub")
public class testController {
   @GetMapping
    public String test1(){
        return "test1";
    }



}
