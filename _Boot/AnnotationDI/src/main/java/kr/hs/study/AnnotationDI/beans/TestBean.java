package kr.hs.study.AnnotationDI.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data  //set, get, constructor
@Component
public class TestBean {
    @Value("kim")
    private String name;
    @Value("nickKim")
    private String nickName;


}
