package 반복문;

public class BreakDemo {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            if(i == 5) //i의 값이 5일때
                break; //반복문 안에서 break가 실행되면 반복문을 즉시 종료시킨다.
            System.out.println("안녕하세요" + i);
        }
    }
}
