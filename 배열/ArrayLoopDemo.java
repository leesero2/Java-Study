package 배열;

public class ArrayLoopDemo {
    public static void main(String[] args) {
        String[] members = {"이지훈","고동현","송수현","김태원"}; //배열 크기는 4
        for(int i = 0; i<members.length; i++){ //배열 크기만큼 반복을 한다는 뜻
            String member = members[i]; //i가 반복하니 i값의 배열위치가 계속 출력
            System.out.println(member + "이 상담을 받았습니다.");
        }
    }
}
