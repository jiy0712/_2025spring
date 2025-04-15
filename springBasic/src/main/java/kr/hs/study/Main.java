package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext ctx=
                new ClassPathXmlApplicationContext("config.xml");
        TestBean obj1=ctx.getBean("t1", TestBean.class);
        System.out.println("obj1:"+obj1);
//
//          TestBean obj2=ctx.getBean("t1",TestBean.class);
//          System.out.println("obj2:"+obj2);

        ctx.close();

    }
}








