package 유효범위;

public class ScopeDemo2_1 {
    static int i; //클래스에서 선언된 변수. 전역 변수라고 함.

    static void a(){
       int i = 0; //메소드 안에 선언된 변수. 지역변수라고도 함
    }

    public static void main(String[] args) {
        for(i = 0; i<5; i++){ //여기서 i의 값은 main밖에 ScopeDemo2 클래스안에 선언된 i 전역번수임.
            a();//아까는 전역변수의 i를 a라는 메소드에서 초기화를 해서 무한반복이 일어났지만 a라는 메소드안에서 int를 선언해서 이름은 같지만 또다른 변수가 됨
            System.out.println(i); //그래서 값이 정상 출력됨.
        }
    }
}
//출처 - 생활코딩