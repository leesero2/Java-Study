package 자바조건문;

public class Condition3 {
    public static void main(String[] args) {
        //else if절
        //if절의 값이 true면 then절이 실행된다. false라면 else if절로 넘어간다.
        //else if절의 값이 true라면 else if then절이 실행된다.
        //false라면 else절이 실행됨.
        //else if절은 복수로 사용 가능하고 else절은 생략도 가능함. 단 else절이 else if절보다 먼저 등장할 수는 없다.
        if(false){
            System.out.println(1);
        }else if(true){
            System.out.println(2);
        }else if(true){
            System.out.println(3);
        }else{
            System.out.println(4);
        }
    }
}
//출처 - 생활코딩