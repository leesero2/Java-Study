package 배열;

public class ForeachDemo {
    public static void main(String[] args) {
        String[] members = {"이지훈","고동현","송수현","김태원"};
        for(String group : members){
            System.out.println(group + "이 상담을 받았습니다.");
        }
    }
}
