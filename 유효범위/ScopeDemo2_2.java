package 유효범위;

public class ScopeDemo2_2 {
    static int i; //클래스에서 선언된 변수. 전역 변수라고 함.

    static void a(){
        i = 0; //메소드 안에 선언된 변수. 지역변수라고도 함
    }

    public static void main(String[] args) {
        for(int i = 0; i<5; i++){ //여기서 i의 값은 전역변수 i의 값이 아닌 main메소드에서 선언한 지역변수 i임.
            a();//a라는 메소드는 전역변수 i의 값을 사용하고있음.
            System.out.println(i); //값이 정상출력됨.
        }
    }
}
//출처 - 생활코딩