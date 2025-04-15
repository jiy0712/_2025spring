package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
   
        ClassPathXmlApplicationContext ctx=
                new ClassPathXmlApplicationContext("config.xml");
        TestBean1 obj1=ctx.getBean("t1",TestBean1.class);
        System.out.println("data1:"+obj1.getData1());
        System.out.println("data2:"+obj1.getData2());
        System.out.println("data3:"+obj1.isData3());
        System.out.println("data4:"+obj1.getData4());
     ctx.close();
    }
}