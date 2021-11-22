package 메소드;

public class ReturnDemo2 {
    public static String num(int i){
        if(i == 0){
            return "zero";
        }else if(i == 1){
            return "one";
        }else if(i == 2){
            return "twoo";
        }
        return "none";
    }

    public static void main(String[] args) {
        System.out.println(num(15));
    }
}
//출처 - 생활코딩
