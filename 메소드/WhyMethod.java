public class WhyMethod {
    public static void main(String[] args) { //메인이라는 메소드가 반드시 있어야함. args는 메인이라는 메소드를 자바가 실행할때 입력값 args를 통해서 들어감.
        printTwoTimesA("a","-"); //문자열 a를 넣었기 때문에 해당 참조변수인 text에 지정이 됨. 구분자도 delimiter로 지정됨
        printTwoTimesA("a","*");
        printTwoTimesA("a","&");
        printTwoTimesA("b","!");


    }

    public static void printTwoTimesA(String text, String delimiter){ //String은 해당 메소드는 문자열만 받는다는 말이고 text는 그 문자열 변수를 말함.
        //delimiter은 구분자를 뜻함.
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }

}
