public class FirstMethod {

    public static void main(String[] args) {
        printTwoTimesA("a"); //문자열 a를 넣었기 때문에 해당 참조변수인 text에 저장이 됨.
        printTwoTimesA("a");
        printTwoTimesA("a");
        printTwoTimesA("b");


    }

    public static void printTwoTimesA(String text){ //String은 해당 메소드는 문자열만 받는다는 말이고 text는 그 문자열 변수를 말함.
        System.out.println("-");
        System.out.println(text);
        System.out.println(text);
    }
}
