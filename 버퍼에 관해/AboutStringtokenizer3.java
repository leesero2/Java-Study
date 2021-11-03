package lee01;

import java.io.*;
import java.util.StringTokenizer;

public class AboutStringtokenizer3 {
    public static void main(String[] args) throws IOException {
        //StringTokenizer 클래스는 문자열을 토큰으로 나눌 수 있음. 토큰은 문자열을 구성하는 단위.
        //StringTokenizer st = new StringTokenizer(문자열);
        //StringTokenizer st = new StringTokenizer(문자열, 기준문자);
        //StringTokenizer st = new StringTokenizer(문자열, 기준문자, true/false); 으로 파라미터를 한개부터 세개까지 사용이 가능함

        StringTokenizer st = new StringTokenizer("100,200,300,400,500",",",false);
        //해당 문자열의(100,200,300,400,500)에서 기준문자를 ,를 해서 토큰을 ,를 기준으로 분리함 하지만 마지막 true는 기준 문자열도 토큰에 포함을 시킴
        // 그말은 즉슨 "100" "," "200" "," "300" "," "400" "," "500" 을 전부 토큰화 한다는 말. 반대로 마지막이 false면 기준 문자열도 토큰에 포함시키지 않음
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }

    }
}
