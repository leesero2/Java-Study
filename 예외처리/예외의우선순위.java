public class 예외의우선순위 {
    public static void main(String[] args) {
        //예외가 먼저 발생한다면 그거부터 먼저 예외처리가 발생한다고 예외처리4에서 공부함
        //그러면 공통적인 부모 예외처리를 사용하는 방법.
        System.out.println(1);
        int[] score = {10,20,30};
        try{
            System.out.println(2);
            System.out.println(score[3]);
            System.out.println(3);
            System.out.println(2/0);
            System.out.println(4);
//        }catch (ArithmeticException e) { //이부분을 넣게된다면 정수형부분이 잘못되면 Exception 예외처리부분보다 이거먼저 실행됨. 만약 배열부분 예외가 발생하면 아래 Exception 예외처리로 빠짐
//            System.out.println("정수형 부분 계산이 잘못되었습니다.");
        }
        catch (Exception e) { //배열 예외처리와 정수형 예외처리부분의 부모(공통상위) 예외인 Exception을 사용하면 됨.
            System.out.println("오류가 발생하였습니다.");
        }
        System.out.println(5);
    }
}
