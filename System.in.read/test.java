package System.in.read;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        int a = System.in.read();
        //1234를 입력하면 49가 출력된다
        //1234중에 딱 1만 받아들여 아스키코드로 출력함. 문자한개만 받아들임. 버퍼를 사용하기때문에 예외처리를 해주어야한다.
        System.out.println(a);

    }
}
