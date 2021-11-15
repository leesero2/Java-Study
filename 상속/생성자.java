package 상속;

//생성자는 메소드와 똑같지만 다른점은 리턴타입을 써줄 수 없다. 이미 정해져있기에

class lee1{
    int v1,v2;
    lee1(int v1, int v2){
        System.out.println("lee1 init!!"); //첫번재로 얘가 실행됨
        this.v1 = v1; this.v2 = v2;
    }
    public int sum(){return this.v1+v2;}
}

class lee2 extends lee1{

    lee2(int v1, int v2) {
        super(v1, v2);      //부모 클래스를 호출하기때문에 lee1 init!!이 실행됨
        System.out.println("lee2 init!!"); // 그 다음 얘가 출력됨
    }
    public int minus(){return this.v1-v2;}
}

public class 생성자 {
    public static void main(String[] args) {
        lee1 L = new lee1(2,1);
        lee2 L2 = new lee2(2,1);
        System.out.println(L2.sum()); //L2는 sum함수가 없지만 부모클래스를 상속받기 때문에 부모클래스의 sum 함수를 갖고옴
        System.out.println(L2.minus()); // minus함수는 원래 갖고있기 때문에 마이너스도 잘 출력됨.
    }
}
