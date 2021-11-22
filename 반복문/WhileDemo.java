package 반복문;

public class WhileDemo {
    public static void main(String[] args) {
        //구조 : while(조건){ 반복 실행 영역 }
        //while문은 조건이 참이면 중괄호 구간을 반복적으로 실행한다.
        //반복문에서 종료조건을 잘못 지정한다면 무한 반복되거나 반복문이 실행되지 않는다.

        while(true){ //조건이 true이기 때문에 반복이 실행된다.
            System.out.println("Coding Everybody");
        } //이 반복문은 종료조건이 없어서 무한 반복이 일어난다.

        int i = 0;
        while(i<10){ //i가 10보다 작으면 반복
            System.out.println("안녕하세요" + i);
            i++; //i를 증감.
        } //총 10번의 반복이 실행됨.

        while(false){ //false이면 실행이 되지 않는다.
            System.out.println("Coding Everybody");
        }

    }
}
//출처 - 생활코딩
