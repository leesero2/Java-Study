import java.util.Iterator;
import java.util.LinkedList;

public class descendingIterator반복자 {
    public static void main(String[] args) {
        //descendingIterator(); 메소드를 썼을 때의 결과
        LinkedList<String> link = new LinkedList<>();
        link.add("이지훈");
        link.add("이다훈");
        link.add("이대성");

        Iterator<String> itr = link.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
//출처 - https://blog.naver.com/jjekjjek7/222026972289