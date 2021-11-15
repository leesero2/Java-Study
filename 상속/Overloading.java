package 상속;
//overloading은 과적하다, 너무 많이 탑제하다 라는 뜻이 있다고 함.
//기본적으로 오버로딩은 상속과는 상관이 없음.

class A{ //기존에 있던 정수 더하기 함수에
    public int sum(int v1, int v2){
        return v1+v2;
    } //똑같은 형태의 함수이름과 변수이름을 더 적어도 상관이 없다는 말.
      //그게 오버로딩
    public int sum(int v1, int v2, int v3){
        return v1+v2+v3;
    }
}


public class Overloading {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.sum(2,1,1)); //A클래스의 함수중에 정수 3개를 더하는 함수를 적용시킴.

    }
}
