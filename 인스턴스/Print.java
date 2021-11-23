package 클래스;

class Print { //클래스를 선언구조는 "class 클래스이름 {}"

    public String delimiter = ""; //클래스 메소드랑 차이점이 static이 없음.

    public void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}//메소드와 변수를 통틀어서 멤버라고함. 위의 클래스의 멤버는 delimiter,A,B
//출처 - 생활코딩