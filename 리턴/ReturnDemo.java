package 메소드;

public class ReturnDemo {
    public static int one() {
        return 1;
//        return 2; 여기서부터 return3까진 컴파일 조차 되지않는다. 리턴은 메소드를 종료시키는 역할을 하기 때문.
//        return 3;
    }

    public static void main(String[] args) {
        System.out.println(one());
    }
}
//출처 - 생활코딩