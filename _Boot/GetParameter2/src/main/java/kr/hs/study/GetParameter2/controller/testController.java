package kr.hs.study.GetParameter2.controller;

import jakarta.servlet.http.HttpServletRequest;
import kr.hs.study.GetParameter2.dto.testDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
     //get방식으로 test1에 접속했을 때 test1 함수를 실행하고
    // result.html 을 실행해라
    @GetMapping("/test1")
    public String test1(HttpServletRequest req){
//         //
//        System.out.println("data1:"+data1);
//        System.out.println("data2:"+data2);
        return "result";
    }
//    test2/100/200/300
    @GetMapping("/test2/{data1}/{data2}/{data3}")
    public String test2(@PathVariable("data1") String a,
                      //data1에 있는 값을 a에 대입한다.
                        @PathVariable("data2") String b,
                        @PathVariable("data3") String c
                        ) {
        System.out.println("data1:"+a);
        System.out.println("data2:"+b);
        System.out.println("data3:"+c);
        return "result";

    }
    @GetMapping("/test3")
    public String test3(@RequestParam("data1") String a,
                        @RequestParam("data2") String b,
                        @RequestParam("data3") String []c
                        ){
        return "result";
    }
    @GetMapping("/test4")
    public String test4(testDTO dto) {

        return "result";
    }
}
