package 메소드;

public class ReturnDemo3 {
    //하나의 메소드는 하나의 값만을 반환할 수 있기에 각각의 회원정보를 반환하는 메소드를 만듦.
    public static String getMember1(){
        return "이지훈";
    }

    public static String getMember2(){
        return "이다훈";
    }

    public static String getMember3(){
        return "정귀재";
    }

    public static void main(String[] args) {
        System.out.println(getMember1());
        System.out.println(getMember2());
        System.out.println(getMember3());
    }

}
