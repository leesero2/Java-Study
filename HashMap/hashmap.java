import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        //HashMap 사용법
        HashMap<String,String> map1 = new HashMap<String,String>();//HashMap생성
        HashMap<String,String> map2 = new HashMap<>();//new에서 타입 파라미터 생략가능
        HashMap<String,String> map3 = new HashMap<>(map1);//map1의 모든 값을 가진 HashMap생성
        HashMap<String,String> map4 = new HashMap<>(10);//초기 용량(capacity)지정
        HashMap<String,String> map5 = new HashMap<>(10, 0.7f);//초기 capacity,load factor지정
        HashMap<String,String> map6 = new HashMap<String,String>();   //초기값 지정
        map6.put("a","b");
        //HashMap을 생성하려면 키 타입과 값 타입을 파라미터로 주고 기본생성자를 호출하면 됩니다.
        //HashMap은 저장공간보다 값이 추가로 들어오면 List처럼 저장공간을 추가로 늘리는데 List처럼 저장공간을 한 칸씩 늘리지 않고 약 두배로 늘립니다.
        //여기서 과부하가 많이 발생합니다. 그렇기에 초기에 저장할 데이터 개수를 알고 있다면 Map의 초기 용량을 지정해주는 것이 좋습니다.

        //HashMap 추가
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"사과");
        map.put(2,"바나나");
        map.put(3,"포도");
        //HashMap에 값을 추가하려면 put(key,value) 메소드를 사용하면 됩니다.
        //선언 시 HashMap에 설정해준 타입과 같은 타입의 Key와 Value값을 넣어야 하며 만약 입력되는 키 값이 HashMap 내부에 존재한다면 기존의 값은 새로 입력되는 값으로 대치됩니다.

        //HashMap 값 삭제
        HashMap<Integer,String> mapD = new HashMap<Integer,String>(){{//초기값 지정
            put(1,"사과");
            put(2,"바나나");
            put(3,"포도");
        }};
        map.remove(1); //key값 1 제거
        map.clear(); //모든 값 제거
        //HashMap에 값을 제거하려면 remove(key) 메소드를 사용하면 됩니다.
        //오직 키값으로만 Map의 요소를 삭제할 수 있습니다. 모든 값을 제거하려면 clear() 메소드를 사용하면 됩니다.

        //HashMap 값 출력
        System.out.println(map); //전체 출력 : {1=사과, 2=바나나, 3=포도}
        System.out.println(map.get(1));//key값 1의 value얻기 : 사과

        //entrySet() 활용
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
        }
        //[Key]:1 [Value]:사과
        //[Key]:2 [Value]:바나나
        //[Key]:3 [Value]:포도

        //KeySet() 활용
        for(Integer i : map.keySet()){ //저장된 key값 확인
            System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
        }
        //[Key]:1 [Value]:사과
        //[Key]:2 [Value]:바나나
        //[Key]:3 [Value]:포도

        //HashMap을 출력하는 방법에는 다양한 방법이 있습니다. 그냥 print하게 되면 {}로 묶어 Map의 전체 key값, value가 출력됩니다.
        // 특정 key값의 value를 가져오고싶다면 get(key)를 사용하면 되고 전체를 출력하려면 entrySet()이나 keySet()메소드를 활용하여 Map의 객체를 반환받은 후 출력하면 됩니다.
        // entrySet()은 key와 value 모두가 필요할 경우 사용하며 keySet()은 key 값만 필요할 경우 사용하는데
        // key값만 받아서 get(key)를 활용하여 value도 출력할 수도 있기에 어떤 메소드를 선택하든지 간에 큰 상관이 없어 대부분 코드가 간단한 keySet을 활용하시던데
        // key값을 이용해서 value를 찾는 과정에서 시간이 많이 소모되므로 많은 양의 데이터를 가져와야 한다면 entrySet()이 좋습니다.(약 20%~200% 성능 저하가 있음)



    }
}
//HashMap 이란?
//HashMap은 Map 인터페이스를 구현한 대표적인 Map 컬렉션입니다. Map 인터페이스를 상속하고 있기에 Map의 성질을 그대로 가지고 있습니다.
//Map은 키와 값으로 구성된 Entry객체를 저장하는 구조를 가지고 있는 자료구조입니다. 여기서 키와 값은 모두 객체입니다.
//값은 중복 저장될 수 있지만 키는 중복 저장될 수 없습니다. 만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대치됩니다.
//HashMap은 이름 그대로 해싱(Hashing)을 사용하기 때문에 많은 양의 데이터를 검색하는 데 있어서 뛰어난 성능을 보입니다.



//출처 - https://coding-factory.tistory.com/556