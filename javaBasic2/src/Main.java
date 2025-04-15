import kr.hs.study.HelloWorld;
import kr.hs.study.HelloWorldEn;

public class Main {
    public static void main(String[] args) {
           HelloWorld h1=new HelloWorldEn();
           //부모의 참조변수    // 자식객체생성
           callMethod(h1);
        }
        public static void callMethod(HelloWorld  hello) {
        hello.sayHello();
        }
    }
