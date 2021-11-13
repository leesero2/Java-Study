package 공부;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {
    public static void main(String[] args) {
        try { //FileWriter에 예외처리를 안하면 실행이 안됨.
            FileWriter f = new FileWriter("data.txt"); //data.txt라는 파일에 쓰기작업을 하기위한 준비를 하는것
            f.write("hello");
            f.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
//Checked Exception이란 컴퓨터가 컴파일 하기전에 이거 예외처리 안하면 실행못한다라고 미리 알려주는것 ex) BufferedWrited, Filewriter ...
//UnChecked Exception이란 컴파일 후에 결과로 예외가 필요하다고 알려주는것 ex)정수값이나 배열값등이 범위를 벗어났을때 뜨는 에러 등등..