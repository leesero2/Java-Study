import java.util.Arrays;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        //HashSet 사용법
        //HashSet 선언
        HashSet<Integer> set1 = new HashSet<Integer>();//HashSet생성
        HashSet<Integer> set2 = new HashSet<>();//new에서 타입 파라미터 생략가능
        HashSet<Integer> set3 = new HashSet<Integer>(set1);//set1의 모든 값을 가진 HashSet생성
        HashSet<Integer> set4 = new HashSet<Integer>(10);//초기 용량(capacity)지정
        HashSet<Integer> set5 = new HashSet<Integer>(10, 0.7f);//초기 capacity,load factor지정
        HashSet<Integer> set6 = new HashSet<Integer>(Arrays.asList(1,2,3));//초기값 지정
        //HashSet을 기본으로 생성했을때에는 initial capacity(16), load factor(0.75)의 값을 가진 HashSet객체가 생성됩니다.
        //HashSet도 저장공간보다 값이 추가로 들어오면 List처럼 저장공간을 늘리는데 Set은 한 칸씩 저장공간을 늘리지 않고 저장용량을 약 두배로 늘립니다.
        //여기서 과부하가 많이 발생합니다. 그렇기에 초기에 저장할 데이터 갯수를 알고 있다면 Set의 초기용량을 지정해주는 것이 좋습니다.

        //HashSet 값 추가
        HashSet<Integer> set = new HashSet<Integer>();//HashSet생성
        set.add(1); //값 추가
        set.add(2);
        set.add(3);
        //HashSet에 값을 추가하려면 HashSet의 add(value) 메소드를 사용하면 됩니다.
        //입력되는 값이 HashSet 내부에 존재하지 않는다면 그 값을 HashSet에 추가하고 true를 반환하고 내부에 값이 존재한다면 false를 반환합니다.

        //HashSet 값 삭제
//        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));//HashSet생성
//        set.remove(1);//값 1 제거
//        set.clear();//모든 값 제거
        //HashSet에 값을 제거하려면 HashSet의 remove(value) 메소드를 사용하면 됩니다.
        //매개변수 value의 값이 HashSet 내부에 존재한다면 그 값을 삭제한 후 true를 반환하고 없다면 false를 반환합니다. 모든 값을 제거하려면 clear() 메소드를 사용하면 됩니다.

        //HashSet 크기 구하기
//        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));//HashSet생성
//        System.out.println(set.size());//set 크기 : 3
            //HashSet의 크기를 구하려면 size() 메소드를 사용하면 됩니다.

        //HashSet 값 출력
//        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));//HashSet생성
//
//        System.out.println(set); //전체출력 [1,2,3]
//
//        Iterator iter = set.iterator();	// Iterator 사용
//        while(iter.hasNext()) {//값이 있으면 true 없으면 false
//            System.out.println(iter.next());
//        }
        //Set컬렉션을 그냥 print하게 되면 대괄호 [ ]로 묶여서 set의 전체 값이 출력됩니다.
        // Set에는 인덱스로 객체를 가져오는 get(index) 메소드가 없습니다. 대신 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator)를 제공합니다.
        // 반복자 이터레이터 인터페이스를 구현한 객체를 말하는데 iterator() 메소드를 호출하면 얻을 수 있습니다.
        // Iterator에서 하나의 객체를 가져올 때는 next() 메소드를 사용합니다. next() 메소드를 사용하기 전에 먼저 가져올 객체가 있는지 확인하는 것이 좋습니다.
        // hasNext() 메소드는 가져올 객체가 있으면 true를 리턴하고 없으면 false를 리턴합니다.


        //HashSet 값 검색
        //HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));//HashSet생성
        //System.out.println(set.contains(1)); //set내부에 값 1이 있는지 check : true

        //HashSet 내부에 원하는 값이 있는지 확인하고 싶다면 contains(value) 메소드를 사용하면 됩니다.
        //파라미터로 주어진 객체가 HashSet이 가지고 있다면 true, 아니면 false를 반환합니다.
    }
}
