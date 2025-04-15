package kr.hs.study.GetParameter2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class test2Controller {
    @GetMapping("/input")
    public String input_form(){
        return "input_form";
    }
    @PostMapping("/test_1")
    public String num_1(@RequestParam("num1") int [] num) {
        //num: 1,2,3,4,5가 배열로 들어가 있음
        int oddSum=0;
        int  evenSum=0;
        for(int i=0;i<num.length;i++) {
            if(i%2==0) {
                evenSum+=num[i];
            }else {
                oddSum+=num[i];
            }
        }
        System.out.println("oddSum:"+oddSum);
        System.out.println("evenSum:"+evenSum);
        return "result";

    }
}
