package kr.hs.study.UrlMapping.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HomeController {
    //최종:get방식으로 /에 접속했을 때 index.html파일을 실행해라

    @RequestMapping(value="/",method= RequestMethod.GET)

    public String home(){
        return "index";

    }
    @GetMapping
    public String test1(){
        return "test1";
    }
}
