

//무명배열 - 무명배열은 즉시 배열을 만들어서 함수의 인수로 전달하고자 할 때 많이 사용된다. 특히 안드로이드 프로그래밍에서도 상당히 사용되므로 반드시 알아야함
//무명배열은 배열이 한번만 필요한곳에서만 사용이 가능 (이름이 없기 때문)
//new 배열타입[] {값1,값2,값3 ... } 으로 표현함


public class anonymous_arrays {
    public static void main(String[] args) {
        System.out.println("숫자들의 합 : " + sum(new int[]{1, 2, 3, 4, 5}));
        //먼저 이름이 존재하지 않는 무명배열이 생성되어 sum으로 전달

    }
    public static int sum(int[] numbers){ //무명배열은 numbers로 들어간다. numbers가 배열의 이름이 된셈.

        int total = 0;
        for (int i = 0; i<numbers.length; i++){ //number 배열의 크기는 5 그래서 for문을 5번 반복
            total = total + numbers[i]; // 0 = 0 + 1(number[0]), 1 = 1 + 2(number[1]) .....
        }
        //total과 numbers를 이용해 주어진 인덱스들의 합을 구하고, 다시 sum으로 반환하면 원하는 값이 출력되는 것을 확인 할 수 있다.
        return total;
        }
    }

    //어떤 메소드에 배열을 전달 하려고 한다. 해당 배열은 메소드에만 전달하면 되고, 다른 곳에서는 일체 사용되지 않는경우에 무명 배열이 사용됨.