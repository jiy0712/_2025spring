package kr.hs.study.beans;

public class TestBean1 {
    public TestBean1(){
        System.out.println("TestBean1의 기본생성자");
    }
    public void init_Method(){
        System.out.println("TestBean1의  initMethod");
    }
    public void destroy_Method(){
        System.out.println("TestBean1 의 destroyMethod");
    }
}
