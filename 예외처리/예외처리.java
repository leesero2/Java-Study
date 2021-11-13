public class 예외처리 {
    public static void main(String[] args) {
        System.out.println(1);
        //System.out.println(2/0);
        System.out.println(3);
        //이렇게 출력하면 2번째 2/0 부분은 자바에서 0을 나누는것은 없기때문에 ArithmeticException 예외가 발생함.
        //이것을 try문으로 잡으면 됨
        try{
            System.out.println(2/0);
        } catch (ArithmeticException e){ //위에서 뜬 ArithmeticException 예외를 넣어주고 e는 변수명이라 e말고 아무거나 넣어줘도 상관없음.
            System.out.println("잘못된 계산입니다.");
        } //이렇게 try문을 넣어주면 해당 계산이 잘못되었을때 아래 출력문이 나오도록 설정

    }
}
