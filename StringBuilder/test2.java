package StringBuilder;

public class test2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("[StringBuilder 동적 문자열 조작 - append추가, insert삽입, delete삭제, replace교체, reverse역순 출력]");

        /*[설 명]
         * 1. StringBuilder 는 문자열을 자유롭게 조작을 할 수 있는 객체입니다 (삽입,삭제,수정 등 ...)
         * 2. StringBuilder는 StringBuffer와 비슷한 속성을 가지고있습니다
         * 3. append - 문자열을 추가할 때 사용합니다
         * 4. insert - 특정 번지에 문자열을 삽입하겠다는 의미입니다
         * 5. delete - 특정 번지부터 특정번지 전까지 삭제하겠다는 의미입니다
         * 6. replace - 특정 번지부터 특정번지 전까지 교체하겠다는 의미입니다
         * 7. reverse - 문자열 데이터를 역순으로 정렬하겠다는 의미입니다
         */

        //초기 StringBuilder 객체 선언
        StringBuilder sb = new StringBuilder();

        //데이터 추가 실시
        sb.append("hello");
        sb.append("안녕");
        System.out.println("데이터 추가 : "+sb.toString());

        //데이터 삽입 실시
        sb.insert(5, "java"); //5번째 자리에 데이터 삽입 실시
        System.out.println("데이터 삽입 : "+sb.toString());

        //데이터 삭제 실시
        sb.delete(9, 11); //9번째 자리부터 11번 전까지 즉, 10번까지 삭제하겠다
        System.out.println("데이터 삭제 : "+sb.toString());

        //데이터 교체 실시
        sb.replace(5, 9, "자바"); //5번째 자리부터 9번 전까지 즉, 8번까지 문자열을 교체하겠다
        System.out.println("데이터 교체 : "+sb.toString());

        //데이터 역순(거꾸로 출력)
        sb.reverse();
        System.out.println("데이터 역순 : "+sb.toString());

    }//메인 종료

}//클래스 종료

//출처 - https://blog.naver.com/kkh0977/222203466825