package 반복문;

public class ForDemo {
    public static void main(String[] args) {
        //구조 : for(초기화, 종료조건, 반복실행){ 반복적으로 실행될 구문 }
        //초기화 : 반복문이 실행될 때 1회 실행된다.
        //종료조건 : 초기화가 실행된 후에 종료조건이 실행된다. 종료조건의 값이 false일 때까지 반복문의 중과호 구간의 코드가 반복 실행된다.
        //중괄호 구간의 실행이 끝나면 반복실행이 시작. 종료조건이 false가 될 때까지 이 과정이 반복.

        for(int i = 0; i<10; i++){
            System.out.println("안녕하세요" + i);
        }
    } //총 10번반복
}
