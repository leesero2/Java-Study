import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 배열정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];

        for(int i = 0; i<array.length; ++i){
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);

        for(int s : array){
            System.out.println(s +" \n");
        }
    }
}
