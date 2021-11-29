package CharAt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        System.out.println("첫 단어: "+ a.charAt(0));
        char[] arr = new char[a.length()];
        for(int i = 0; i<a.length(); i++){
            arr[i] = a.charAt(i);
        }

        for(char value : arr){
            System.out.println(value);
        }

    }
}
