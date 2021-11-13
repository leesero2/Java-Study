package 공부;

import java.io.FileWriter;
import java.io.IOException;

public class finally공부 {
    public static void main(String[] args) {
        FileWriter f = null; //null값으로 초기화
        try { //FileWriter에 예외처리를 안하면 실행이 안됨.
            f = new FileWriter("data.txt"); //data.txt라는 파일에 쓰기작업을 하기위한 준비를 하는것
            f.write("hello");
            //f.close(); //close 메소드를 여기에다 두면 안됨. 이유는 예외처리가 발생했을때 이부분을 씹히고 catch문으로 넘어갈 수 있기 때문
            //그걸 해결 할 수 있는게 finally 임
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if(f != null) {
                try {
                    f.close(); //try문에서 예외가 발생했건 안했건 무조건 finally가 발생함.
                }catch (IOException e){ //close가 이미 예외문 밖에 있어서 또 예외처리함.
                    e.printStackTrace();
                }
            }
        }
    }
}
