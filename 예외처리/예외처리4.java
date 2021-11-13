public class 예외처리4 {
    public static void main(String[] args) {

        System.out.println(1);
        int[] score = {10,20,30};
        try{
            System.out.println(2);
            System.out.println(score[3]);
            System.out.println(3);
            System.out.println(2/0);
            System.out.println(4);
        } catch (ArithmeticException e){
            System.out.println("잘못된 계산이네요");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("잘못된 값을 찾고 있네요");
        }
        System.out.println(5);
    }
}
