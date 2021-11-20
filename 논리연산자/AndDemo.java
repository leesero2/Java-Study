package 형변환;

public class AndDemo {
    public static void main(String[] args) {
        if(true && true){
            System.out.println(1);
        }

        if(true && false){
            System.out.println(2);
        }

        if(false && true){
            System.out.println(3);
        }

        if(false && false){
            System.out.println(4);
        }
    }
}
//결과는 1이다. and의 좌,우항이 모두 true인것은 첫번째 조건문밖에 없기때문
//출처 - 생활코딩