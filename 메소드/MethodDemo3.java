package 메소드;

public class MethodDemo3 {
    //MethodDemo2를 메소드를 사용해서 다시 작성.
    //MethodDemo2보다 깔끔하고 로직은 단 한번만 등장.
    public static void numbering(){
        int i =0;
        while(i<10){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering();
        numbering();
        numbering();
        numbering();
        numbering();

    }
}
//출처 - 생활코딩