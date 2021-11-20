package 비교와Boolean;

//Boolean - 불린은 참과 거짓을 의미하는 데이터 타입.
//bool 이라고도 하며 참을 의미하는 true와 거짓을 의미하는 false 두가지값을 가지고 있다.

import java.sql.SQLOutput;

public class EqualDemo {
    public static void main(String[] args) {

        //비교연산자 '==' : 좌항과 우항이 비교해서 값이 같다면 true 다르다면 false가 됨.
        System.out.println(1 == 2); //false
        System.out.println(1 == 1); //true
        System.out.println("one" == "two"); //false
        System.out.println("one" == "one"); //true

        //비교연산자 '!=' : !는 부정을 의미. 같다의 부정은 같지않다 이다. ==와 정반대의 결과를 나타냄
        System.out.println(1 != 2); //true
        System.out.println(1 != 1); //false
        System.out.println("one" != "one"); //false
        System.out.println("one" != "two"); //true

        //비교연산자 '>' : 좌항이 우항보다 크면 참, 그렇지 않다면 거짓
        System.out.println(10>20); //false
        System.out.println(10>2); //true
        System.out.println(10>10); //false

        //비교연산자 '>=' 좌항이 우항보다 크거나 같다. '<='는 반대의 의미
        System.out.println(10 >= 20); //false
        System.out.println(10 >= 2); //true
        System.out.println(10 >= 10); //true

        //메소드 ".equals" : 문자열을 비교할때 사용하는 메소드.
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a ==b); //false
        System.out.println(a.equals(b));//true

    }
}
