package 유효범위;

public class ScopeDemo6 {
    static int i = 5;

    static void a(){
        int i = 10;
        b(); //b메소드를 실행
    }

    static void b(){
//        int i = 30; 여기서 i의 값을 30으로 지정하면 30이 뜸.
        System.out.println(i);//여기서 i는 전역변수
    }

    public static void main(String[] args) {
        a(); //a메소드에 i변수 선언후 10을 지정했지만 호출은 b메소드만 했기에 5만 출력됨.
    }
}
