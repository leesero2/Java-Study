package lee01;

import java.io.*;
import java.util.StringTokenizer;

public class AboutStringtokenizer {
    public static void main(String[] args) throws IOException {
        //StringTokenizer 클래스는 문자열을 토큰으로 나눌 수 있음. 토큰은 문자열을 구성하는 단위.
        //StringTokenizer st = new StringTokenizer(문자열);
        //StringTokenizer st = new StringTokenizer(문자열, 기준문자);
        //StringTokenizer st = new StringTokenizer(문자열, 기준문자, true/false); 으로 파라미터를 한개부터 세개까지 사용이 가능함

        StringTokenizer st = new StringTokenizer("100,200,300,400,500");

        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
        //이렇게 출력하면 100,200,300,400,500 으로 출력됨.
    }
}
//https://blog.naver.com/nasu0210/222521597913 - 출처