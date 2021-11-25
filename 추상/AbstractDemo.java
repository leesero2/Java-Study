package Abstract;

abstract class A{ //추상클래스는 반드시 상속해서 사용해야함
    public abstract int b();//얘는 추상메소드,추상메소드는 {}이게 없음.


    public void d(){
        System.out.println("world");
    }
}
class B extends A{
    public int b(){
        return 1; //여기에 메소드 b의 {}내용이 들어감. 그래서 실행이 됨. 그래서 추상 메소드, 추상 클래스는 상속을 강요함.
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
//        A obj = new A();
        B obj = new B();
    }

}
