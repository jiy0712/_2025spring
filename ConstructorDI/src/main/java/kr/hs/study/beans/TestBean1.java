package kr.hs.study.beans;

public class TestBean1 {
    private int data1;
    private double data2;
    private String data3;

    public TestBean1(){
        System.out.println("TestBean1의 기본생성자");
        this.data1=1;
        this.data2=1.1;
        this.data3="lay";
    }
    public TestBean1(int data1) {
        System.out.println(" TestBean1의 int 생성자");
        this.data1=data1;
        this.data2=2.2;
        this.data3="kyu";
    }
    public TestBean1(double data2) {
        System.out.println("TestBean1의 double 생성자");
        this.data1=3;
        this.data2=data2;
        this.data3="Mike";
    }
    public TestBean1(String data3) {
        System.out.println("TestBean1의 string  생성자");
        this.data1=5;
        this.data2=5.5;
        this.data3=data3;
    }
//     6, 6.6, Tom
    public TestBean1(int data1, double data2, String data3) {
        System.out.println("TestBean1의 int double string  생성자");
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public void prData(){
        System.out.println("data1:"+data1);
        System.out.println("data2:"+data2);
        System.out.println("data3:"+data3);
    }

}
