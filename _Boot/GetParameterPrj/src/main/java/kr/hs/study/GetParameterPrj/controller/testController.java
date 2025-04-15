package kr.hs.study.GetParameterPrj.controller;

import kr.hs.study.GetParameterPrj.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {
    @GetMapping("/login")
        public String login_form(){
            return "login_form";
        }
  @PostMapping("/login_result")
    public String login_result(LoginDTO dto, Model model) {
       model.addAttribute("login",dto);
       
      return "result";
  }

}
