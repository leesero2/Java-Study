import java.util.Arrays;

public class array_copy {
    public static void main(String[] args) {
        //하나의 배열 변수를 다른 배열 변수로 복사 할 수 있다. 이런 경우에 2개의 변수가 동일한 배열을 참조하게 됨.
        int[] list = {1,2,3,4,5,6,7};
        int[] numbers = list; //number 변수도 list랑 모두 동일한 배열 객체를 가리킴.

        System.out.println(numbers[2]); // 결과는 3

        numbers[2] = 90; // number 배열의 값을 변경시켜도 list도 같이 값이 변함

        System.out.println(numbers[2] + " " + list[2]); // 결과는 90 90

        //만약 이런식 말고 배열의 안의 값만 복사를 하고싶다 하면 copyOf() 메소드를 사용하면됨.

        int[] list_copy = Arrays.copyOf(list,list.length);

        int[] list_copy2 = Arrays.copyOf(list,2*list.length); //배열크기 2배증가도 가능

//        Arrays.copyOf(배열명, 배열크기); 보통 copyOF메소드는 배열의 크기를 증가하는데 많이 사용됨.

        list_copy[3] = 100; //list_copy[3]번째 배열 값을 변경
        System.out.println(list_copy[3]); //결과 100
        System.out.println(list[3]); //결과 4
        //list_copy 배열의 값만 바뀌는걸 확인할 수 있음
    }
}
