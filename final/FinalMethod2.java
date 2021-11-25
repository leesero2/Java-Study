package Final;
//final메소드
class A{ //클래스 A를 생성
    final void b(){} //b라는 메소드를 만드는데 final로 선언
}

class B extends A{ //A클래스를 상속받는 B클래스를 생성
     void B(){}//A클래스안에 b메소드를 오버라이딩
    //에러발생 - b가 final로 지정이 되어있기 때문에(오버라이딩이 안되기 때문)
}

public class FinalMethod2 {
}
