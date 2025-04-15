//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Date클래스를 사용해서 강한결합, 약한결합 만들어봐
        

    }
    public static void memberUse1(){
        // 강한결합 만들어봐..
       Member m=new Member();
    }
    public static void memberUse2(Member m) {
        // 약한 결합 해봐...(밖에서 생성된 객체를 주입받음)
        Member m2=m;
    }
}
class Member{
    String name;
    String nickName;
    private Member() { }
}//생성자가 private일 경우 강한결합은 에러가 나지만,
 //약한결합은 에러가 안난다. 외부에서 무조건 생성했으리라 생각하고 실행
//하기 때문이다.