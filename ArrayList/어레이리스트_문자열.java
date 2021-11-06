package list.arraylist;

import java.util.ArrayList;

public class 어레이리스트_문자열 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        //문자열 ArrayList생성 ( 문자열값만 삽입 가능 )

        //요소 삽입
        arrayList.add("이지훈");
        arrayList.add("이다훈");
        arrayList.add("이대성은 우리아빠");

        //요소 출력
        for(int i = 0; i<arrayList.size(); i++){
            System.out.println((i+1) + " : " + arrayList.get(i) + " "); //get(인덱스) : 요소 추출
        }
        System.out.println();

        //가장 긴 문자열을 추출하기 위한 인덱스 변수
        int number = 0;

        //문자열 길이 비교
        for(int i = 0; i<arrayList.size(); i++){
            if(arrayList.get(number).length() <= arrayList.get(i).length()){ //인덱스가 0 인 array배열이 array의 i 번째보다 작거나 크면
                number = i; // 가장 긴 문자열의 인덱스 값 대입

            }
        }
        System.out.println("가장 긴 문자열 : " + arrayList.get(number)); // 최종적으로 가장 큰 인덱스 출력
    }
}
