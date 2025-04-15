package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //xml파일을 로딩해서 객체를 생성하고 보관해라
        ClassPathXmlApplicationContext  ctx=
                new ClassPathXmlApplicationContext("config.xml");
           TestBean1 obj1=ctx.getBean("t1",TestBean1.class);
        System.out.println("obj1:"+obj1);

       // ctx.close();
    }
}