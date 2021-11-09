package lee01;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력
        StringTokenizer st = new StringTokenizer(br.readLine(),","); //토큰을 쪼개서 저장
        //StringTokenizer로 BufferedReader가 \n 밖에 못읽는걸 " " 공백으로 나누어 버퍼에 저장하도록 함(",")로 저장하면 1,2,3,4,5로 입력하면 ","를 제외한 나머지 데이터값이 저장
        int sum = 0;
        //총합 값 변수를 선언
        while(st.hasMoreElements()){ //hasMoreElements는 토큰이 있으면 true 없으면 false (while문이랑 세트 - true면 반복)
            sum += Integer.parseInt(st.nextToken());//.nextToken() 메소드는 저장된 토큰값을 불러오고 삭제하는 메소드
            //연산을 위해 버퍼 문자열을 숫자데이터로 형변환
        }
        bw.write(String.valueOf(sum));
        //출력을 위해 연산의 결과값인 숫자데이터 sum을 다시 문자열로 바꿈
        //write()메소드는 문자열밖에 출력을 못함
        bw.flush(); //버퍼를 비워야해서 플러쉬 메소드 사용
        bw.close(); //종료메소드

    }
}
//https://blog.naver.com/josephdev123/222532443265 - 출처