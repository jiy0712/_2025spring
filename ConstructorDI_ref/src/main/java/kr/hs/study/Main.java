package kr.hs.study;

import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=
                new ClassPathXmlApplicationContext("config.xml");

        TestBean2 t2=ctx.getBean("t2",TestBean2.class);
        System.out.println("data1:"+t2.getData1());
        System.out.println("data2:"+t2.getData2());
        ctx.close();
    }
}