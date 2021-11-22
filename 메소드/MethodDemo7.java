package 메소드;

import java.io.*;

public class MethodDemo7 {
    public static String numbering(int init,int limit){
        int i = init;
        String output = "";
        while(i<limit){
            output += i;
            i++;
        }
        return output;
    }

    public static void main(String[] args) {
        String result = numbering(1,5);// 메소드에서 총 4번을 반복함.
        System.out.println(result); //결과값을 출력
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt")); //버퍼로 입력을 함
            bw.write(result); //결과 변수를 버퍼 write에 저장
            bw.close();
        }catch (IOException e){ //예외 설정

        }
    }

}
