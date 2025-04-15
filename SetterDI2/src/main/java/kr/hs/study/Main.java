package kr.hs.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext  ctx=
                new ClassPathXmlApplicationContext("config.xml");

        ctx.close();
    }
}