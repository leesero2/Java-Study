//제네릭은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법


class Person<T>{
    public T info; //info라는 필드가 String이라는 데이터타입을 갖는 클래스를 생성
    //미리 데이터타입을 선언하지 않는다는 특징이 있음.
}

public class Generic {
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>(); //p1.info: String 데이터타입
        Person<StringBuilder> p2 = new Person<StringBuilder>(); //p2.info: StringBuilder 데이터타입
    }
}
