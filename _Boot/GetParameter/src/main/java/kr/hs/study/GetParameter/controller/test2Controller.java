package kr.hs.study.GetParameter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class test2Controller {
    int even, odd=0;
    @GetMapping("/input")
    public String input(){
        return "input";
    }
    @PostMapping("/test_1")
    public String test_1(@RequestParam("num1") int [] num) {
        for(int i=0;i<num.length;i++) {
            if(num[i]%2==0) {
                 even+=num[i];
            }
            else {
                odd+=num[i];
            }

        }
        System.out.println("even:"+even);
        System.out.println("odd:"+odd);
        return "result";
    }

}
