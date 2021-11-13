package 상속;

public class ovrriding에대해 {
    public static void main(String[] args) {
        Calb c3 = new Calb(); // Cal3가 Cal 클래스를 상속했기때문에 Cal이 갖는 모든 메소드를 사용 가능함

        System.out.println(c3.minus(3,1)); //결과는 2가 나옴.
        System.out.println(c3.sum(3,1)); // 결과는 4가 나옴.
    }
}


class Cala{ //더하기 계산을 만든 클래스
    public int sum(int v1, int v2){ //int형 두개를 받아들이고
        return v1+v2; //두개를 더한값을 리턴하는 클래스
    }
}

class Calb extends Cal{ //Cal3라는 클래스는 Cal클래스를 확장해서 Cal클래스가 갖고있는 모든 메소드와 변수를 상속받게되는 클래스가 됨.
    public int minus(int v1, int v2){ //int형 두개를 받아들이고
        return v1+v2; //두개를 더한값을 리턴하는 클래스
    }
    public int sum(int v1, int v2){ //부모클래스인 Cal에서 똑같은 메소드에 추가로 내용물을 더할 수도 있음. = 재정의 할 수 있음
        //이런 재정의를 부모가 갖고있는 기능을 덮어쓰기 했다 라는 뜻에서 "Overriding" 라고도 함.
        System.out.println("Cal3!!!"); //더하기만 있는 기능에서 출력문을 추가해 함수를 재정의함.
        return v1+v2;
    }
}
//결론 overriding은 부모의 메소드나 변수등을 상속받아 그걸 덮어씌웠다는 말.