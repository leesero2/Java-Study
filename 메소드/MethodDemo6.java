package 메소드;

public class MethodDemo6 {
    public static String numbering(int init, int limit){
        int i = init;
        //만들어지는 숫자들을 output이라는 변수에 담기위해 변수에 빈 값을 주었다.
        String output = "";
        while(i<limit){
            //숫자를 화면에 출력하는 대신변수를 output에 담았다.
            output += i;
            i++;
        }
        //output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이 return키워드 뒤에 반환하려는 값을 배치하면 됨.
        return output;
    }

    public static void main(String[] args) {
        //메소드 numbering이 리턴한 값이 result에 담긴다.
        String result = numbering(1,5);
        //변수 result의 값을 화면에 출력한다.
        System.out.println(result);
    }
}
//메소드 내에서 사용한 return은 return뒤에 따라오는 값을 메소드의 결과로 반환. 동시에 메소드를 종료시킨다.
//한가지 잊지 말아야 할점은 return을 통해서 반환할 값의 데이터 형식을 메소드의 이름 옆에 명시해 줘야함.
//출처 - 생활코딩