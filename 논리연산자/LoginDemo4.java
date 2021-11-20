package 형변환;

public class LoginDemo4 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if((id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi")) && password.equals("11111")){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
}
//1. (id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi") 가 true가 된다.
//2. password.equals("11111")가 true가 된다
//3. 1번과 2번이 true가 된다.