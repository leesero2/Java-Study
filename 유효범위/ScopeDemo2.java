package 유효범위;

public class ScopeDemo2 {
    static int i; //클래스에서 선언된 변수. 전역 변수라고 함.

    static void a(){
        i = 0; //메소드 안에 선언된 변수. 지역변수라고도 함
    }

    public static void main(String[] args) {
        for(i = 0; i<5; i++){ //여기서 i의 값은 main밖에 ScopeDemo2 클래스안에 선언된 i 전역번수임.
            a();//a라는 메소드는 전역변수 i의 값을 사용하고있음. for문으로 반복할때마다 i를 증감시켜도 여기서 i는 0으로 값이 지정되기때문에
            System.out.println(i); //값이 무한 반복됨.
        }
    }
}
//출처 - 생활코딩