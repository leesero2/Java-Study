public class 예외처리후_메세지띄우기 {
    public static void main(String[] args) {
        //예외처리를 하면서 빨간색 에러코드도 뜨게 하는방법
        int[] arr = {10,20,30};
        try{
            System.out.println(arr[0]);
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println("없는 값이라 출력할 수 없습니다. " + e.getMessage());
            e.printStackTrace(); //해당 메소드를 입력하면 에러 메세지도 같이 띄움.
            //이런 에러메세지는 보안 관련된 곳에서는 어떤 부분에서 에러가 났는지 단서를 제공해주기때문에 내부적으로 관리자들끼리만 볼수있는 곳에서만 사용하는게 좋다고 함.
        }
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
