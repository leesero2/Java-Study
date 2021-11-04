import java.util.Arrays;

//sort()메소드는 퀵정렬 알고리즘을 사용한다. 퀵정렬은 일반적인 경우에 매우 빠르고 효율적인 알고리즘이다.
public class sort {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] purple = new int[SIZE];

        for(int i = 0; i<purple.length; ++i){
            int r = (int) (Math.random() * 100); //0~99까지 보여줌. (만약 0말고 1부터 100까지 하고싶으면 101 입력해야함)
            purple[i] = r;
        }
        System.out.println("처음 입력된 배열 값 : ");
        for(int r : purple)
            System.out.print(r + " ");

        Arrays.sort(purple); // sort() 메소드를 사용후 정렬

        System.out.println("\n 정렬된 리스트: ");
        for(int r : purple)
            System.out.print(r + " ");
    }
}
