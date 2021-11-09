import java.util.Iterator;
import java.util.LinkedList;

public class Iterator반복자 {
    public static void main(String[] args) {
        //Iterator는 Iterator<E>라는 인터페이스 안의 메소드이다. 이 메소드는 리스트의 값을 받아 순차적으로 값을 출력하는 일을 한다.
        LinkedList<String> list = new LinkedList<>();
        list.add("이지훈");
        list.add("이다훈");
        list.add("정귀재");

        Iterator<String> itr = list.iterator();
        //List의 값을 iterator 메소드에 저장하여 저장된 값을 차례대로 호출한다.
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //보통 while문을 쓸 때에는 break로 멈추어 주거나 비교 연산자를 사용하여 true나 false를 반환해 주는데 위 소스코드에는 보이지 않는다.

        //boolean hasNext() - 다음 요소가 존재한다면 true 반환
        //E next() - 다음 요소를 반환
        //void remove() - 현재 위치의 요소 삭제

        //while문 안에 들어간 hasNext() 메소드는 다음 요소가 있는지 체크해 주는 메소드로, 다음 요소가 있으면 true를,
        //없다면 false를 반환하여 List 안의 인스턴스가 모두 확인될 때까지 while문을 실행할 수 있도록 한다.

        System.out.println("\n삭제 후 \n");
        itr=list.descendingIterator(); // iterator(); 메소드는 오름차순으로, descendingIterator(); 메소드는 내림차순으로 정렬해 주는 역할을 한다.
        while(itr.hasNext()){
            String name = itr.next();
            if(name.compareTo("이지훈")==0){ //next가 가리키는 값이 이지훈과 같을 때 itr에 해당하는 인스턴스를 삭제하고 나니 이지훈이 제대로 삭제된 것을 알 수 있다.
                itr.remove();
                continue;
            }
            System.out.println(name); //삭제 후 내림차순으로 출력
        }

    }
}

//출처 - https://blog.naver.com/jjekjjek7/222026972289