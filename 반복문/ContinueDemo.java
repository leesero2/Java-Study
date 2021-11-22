package 반복문;

public class ContinueDemo {
    public static void main(String[] args) {
        //continue는 실행을 즉시 중단하면서 반복을 지속하게 할때 사용된다.

        for(int i = 0; i<10; i++){
            if(i == 5) //i값이 5가 되었을때
                continue; //continue는 이후 로직을 실행하지 않도록 한다.
            System.out.println("안녕하세요" + i); //5를 제외한 반복값이 출력된다.
        }
    }
}
//출처 - 생활코딩