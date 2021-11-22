package 메소드;

//복수의 인자

public class MethodDemo5 {
    public static void numbering(int init, int limit){ //여기서 그냥 두개를 선언해주면 된다.
        int i = 0;
        while(i<limit){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(1,5);
    }
}

//출처 - 생활코딩