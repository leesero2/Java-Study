public class 예외처리3 {
    public static void main(String[] args) {
        //try문을 겹치게 만든다면 어떻게 될까?
        System.out.println(1);
        int[] score = {10,20,30};
        try{ //같이 묶어버린다면 try에서 먼저 실행된 예외만 처리됨.
            System.out.println(score[3]); //배열 예외가 먼저 발생후 바로 catch문으로 탈출
            System.out.println(2/0);
        } catch (ArithmeticException e){ //배열 예외가 먼저 발생되서 해당 예외문은 출력되지않음
            System.out.println("잘못된 계산이네요");
        } catch (ArrayIndexOutOfBoundsException e){ //해당 예외처리가 발생함
            System.out.println("잘못된 값을 찾고 있네요");
        }
        System.out.println(3);
    }
}
