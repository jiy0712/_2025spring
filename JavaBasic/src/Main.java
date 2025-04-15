import kr.hs.study.HelloWorldEn;

public class Main {
    public static void main(String[] args) {
  //HelloWorldEn 객체 만들어서 hi 출력시켜봐
        HelloWorldEn h1=new HelloWorldEn();
        callMethod(h1);

        }
        public static void callMethod(HelloWorldEn hello) {
            hello.sayhello();
        }
    }
