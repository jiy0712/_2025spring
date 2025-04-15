package kr.hs.study.GetParameter.controller;

import jakarta.servlet.http.HttpServletRequest;
import kr.hs.study.GetParameter.dto.test6DTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test1(HttpServletRequest req) {
        String a=req.getParameter("data1");
        String b=req.getParameter("data2");
        System.out.println("data1:"+a);
        System.out.println("data2;"+b);
        return "result";
    }
    @GetMapping("/test2")
    public String test2(HttpServletRequest req) {
        String a=req.getParameter("data1");
        String b=req.getParameter("data2");
        String [] c =req.getParameterValues("data3");
        System.out.println("data1:"+a);
        System.out.println("data2:"+b);
        for(String str: c) {
            System.out.println("data3:"+str);
        }
      return "result";
    }
    @GetMapping("/test4/{data1}/{data2}/{data3}")
    public String test4(@PathVariable("data1") int a,
                        @PathVariable("data2") int b,
                        @PathVariable("data3") int c){
        System.out.println("data1:"+a);
        System.out.println("data2:"+b);
        System.out.println("data3:"+c);
        return "result";
    }
    @GetMapping("/test5")
    public String test5(@RequestParam("data1") int data1,
                        @RequestParam("data2") int data2,
                        @RequestParam("data3") int [] data3){
        System.out.println("data1:"+data1);
        System.out.println("data2:"+data2);
        for(int c : data3) {
            System.out.println("data3:"+c);
        }
        return "result";
    }
    @GetMapping("/test6")
    public String test6(@ModelAttribute test6DTO dto) {
        System.out.println("data1:"+dto.getData1());
        System.out.println("data2:"+dto.getData2());
        return "result";
    }
}











