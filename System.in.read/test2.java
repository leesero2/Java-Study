package System.in.read;

import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        for(int i = 0; i<10; i++){
            int a = System.in.read(); //1234값을 입력
            System.out.println(a + " / "); //49 50 51 52 10 값 출력. 각각해당하는 아스키코드 값이 나옴. 마지막 10은 엔터의키의 아스키코드 값

            //반복문을 이용해서 모든 값을 출력할 수 있음.
        }

    }
}
