
//for each 구조에서는 인덱스 값을 생각할 필요가 없이 배열안의 모든 요소들을 방문할 수 있음
public class for_each {
    public static void main(String[] args) {
        int[] number = {10,20,30};
        for(int value : number) // for(변수 : 배열 )
            //반복이 진행되면서 변수 value에는 number 배열의 첫 번째 원소부터 마지막 배열원소까지 차례대로 입력함

            //for(int i = 0; i< number.length; ++i){
            //    System.out.print(number[i]+" ");
            //}
            //for each루프는 위의 for문이랑 똑같은 효과를 냄.

            System.out.print(value + " ");
    }
}
//장점 - 배열의 크기 신경 안써도됨, 짧음, 간결해서 오류 발생 확률 적음
//단점 - 배열 요소의 값을 변경하는 경우에는 사용 못함,역순으로 배열 요소를 처리하는 경우, 일부 요소만을 처리하는경우, 반복 루프에서 두개 이상의 배열을 처리하는 경우에는 부적합.