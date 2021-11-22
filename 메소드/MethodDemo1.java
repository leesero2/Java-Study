package 메소드;

//main메소드는 규칙이다. 반드시 public static void main(String[] args_가 이끄는 중괄호 안에 실행되기를 기대하는 로직을 위치시켜야한다.
//이것은 자바의 약속
//자바를 실행할때 자바는 우리가 작성한 main메소드를 실행하게 되는 것.

public class MethodDemo1 {
    public static void numbering(){ //numbering 메소드 정의
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(); //numbering메소드를 main 메소드에서 호출
    }
}
//출처 - 생활코딩
