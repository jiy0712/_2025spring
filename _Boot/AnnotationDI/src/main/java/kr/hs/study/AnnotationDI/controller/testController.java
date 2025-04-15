package kr.hs.study.AnnotationDI.controller;

import kr.hs.study.AnnotationDI.beans.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

    @Autowired
    private TestBean test;
    
    @GetMapping("/test1")
    public String test1(){
      System.out.println("name:"+test.getName());
      System.out.println("nickName:"+test.getNickName());
      return "result";
    }
}
