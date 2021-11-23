package 클래스;

class Print{ //클래스를 선언구조는 "class 클래스이름 {}"

    public static String delimiter = ""; //클래스에서 변수선언
    public static void A(){ //메소드 선언
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public static void B(){
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}

public class Class01 {
    public static void main(String[] args) {
        Print.delimiter = "-----";
        Print.A();
        Print.A();
        Print.B();
        Print.B();

        Print.delimiter = "******";
        Print.A();
        Print.A();
        Print.B();
        Print.B();

    }
}
