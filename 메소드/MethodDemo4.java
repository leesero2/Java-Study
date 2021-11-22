package 메소드;

public class MethodDemo4 {
    public static void numbering(int limit){ //여기서 limit라는 변수는 메소드 numbering의 정의 부에 있는 로직들에게 5라는 값을 전달하고 있다.
        //호출에서 입력한 값을 로직으로 매개 한다는 의미에서 이러한 변수를 매개변수라고 한다.
        int i = 0;
        while(i < limit){
            System.out.println(i);
            i++;
        }
    }

    //위의 코드는 아래의 코드와 동일한 의미를갖는다.
    public static void numbering2(){
        int limit = 5;
        int i =0;
        while(i < limit){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(5); //괄호안에 위치한 숫자 5는 메소드가 호출될 때 limit라는 변수의 값이 된다.(4번줄의)
        //이값은 메소드 numbering의 중괄호안에서만 사용할 수 있다.
        //메소드를 호출할때 전달된 값인 여기서 5는 인자라고 한다.하지만 관습적으로 매개변수와 인자를 구분하지 않고 부르는 경우도 많다고 함.

    }
}
//출처 - 생활코딩