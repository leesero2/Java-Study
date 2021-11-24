package 유효범위;

public class ScopDemo4 {
    static void a(){
        String title = "coding everybody";
    }
    public static void main(String[] args) {
        a();
        System.out.println(title);//메소드에서 선언한 지역변수라 에러가 뜸.
    }
}
//출처 - 생활코딩