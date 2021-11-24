package 유효범위;

public class ScopeDemo {
    static void a(){
        int i = 0;//static이기 때문에 main메소드의 for문 i랑은 다르게 동작
    }

    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            a(); //여기서 i는 a라는 메소드안에서 선언이 되었기 때문에 for문에 i랑은 관련 없는 i이기 때문에 무한 반복이 일어나지 않고 잘 실행 되는것.
            System.out.println(i);
        }
    }
}
//출처 - 생활코딩