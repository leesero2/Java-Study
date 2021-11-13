public class 예외처리2 {
    public static void main(String[] args) {
        int[] score = {10,20,30};
        System.out.println(score[0]); // 10출력
        //System.out.println(score[3]); //ArrayIndexOutOfBoundsException 예외가 발생 (배열 예외)
        //그러면 일반 정수형 예외처럼 try문으로 잡으면 됨
        try{
            System.out.println(score[3]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("없는 값을 찾고있네요.");
        }
    }
}
