package 메소드;

public class ReturnDemo4 {
    public static String[] getMembers(){
        String[] members = {"이지훈","이다훈","정귀재"};
        return members;
    }

    public static void main(String[] args) {
        String[] members = getMembers();
    }
}
