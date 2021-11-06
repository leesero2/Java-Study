package list.arraylist;
import java.util.ArrayList;

public class 어레이리스트 {
    public static void main(String[] args) {
        //정수 ArrayList 생성(정수 값만 삽입 가능)
        ArrayList<Integer> arrayList = new ArrayList<>();

        //요소 삽입
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(null);
        arrayList.add(50);
        arrayList.add(2, 30); // 인덱스2 위치에 30 삽입

        //ArrayList의 크기 출력
        System.out.println("ArrayList의 크기: " + arrayList.size()); //출력값 : 5

        //요소 출력
        for(int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i) + " "); //해당 요소들을 전부 출력

        }
        System.out.println();
        //요소 삭제
        arrayList.remove(3); //인덱스 3 위치에 값 삭제

        //요소 삽입
        arrayList.add(3,40); //인덱스 3 위치에 40 삽입

        //요소 출력
        for(int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i)+" "); //get(인덱스) : 요소 추출, 인덱스 3부분에 40이 채워진채로 출력됨.
        }
        System.out.println();

        //마지막 요소 출력
        System.out.println("마지막 요소: " + arrayList.get(arrayList.size() - 1)); //사이즈는 5인데 -1해서 4가 되기때문에 요소 4번값인 50이 출력됨

        //모든 요소 삭제
        arrayList.clear();

        //ArrayList의 크기 출력
        System.out.println("모든 요소 삭제 후 ArrayList의 크기 : " + arrayList.size()); //삭제후 크기 0

    }
}
//ArrayList<E>
//배열을 가변 크기로 다를 수 있음
//객체의 삽입,삭제, 이동이 쉽도록 구성한 컬렉션 클래스
//삽입되는 요소의 갯수에 따라 자동으로 크기 조절
//요소의 삽입과 삭제에 따라 자동으로 요소들의 자리를 이동.
//출처  - https://in.naver.com/dldudcks1779/contents/277587726845408?query=arraylist