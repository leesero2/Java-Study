package 형변환;

public class LoginDemo3 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if(id.equals("egoing") && password.equals("11111")){ //두개의 값이 모두 같을때 참으로 나오는 것
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
}
