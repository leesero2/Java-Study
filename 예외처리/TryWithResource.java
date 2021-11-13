package 공부;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        //try with resource statements 이거 쓰면 간결해지고 알아서 close까지 실행시킴
        try (FileWriter f = new FileWriter("data.txt")){
            f.write("hello");
            //f.close(); close가 필요가 없음. (지워도 됨)
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}


