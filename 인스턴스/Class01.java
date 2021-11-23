package 클래스;

public class Class01 {
    public static void main(String[] args) { //static뜻은 뒤에 따라오는 String이 클래스의 소속이라는 것.
        Print p1 = new Print(); //인스턴스 메소드는 반드시 인스턴스화 시켜야 사용 가능함.
        p1.delimiter = "----";
        p1.A();
        p1.A();
        p1.B();
        p1.B();

        Print p2 = new Print();
        p2.delimiter="****";
        p2.A();
        p2.A();
        p2.B();
        p2.B();

        p1.A();
        p2.A();
        p1.A();
        p2.A();

    }
}
//출처 - 생활코딩