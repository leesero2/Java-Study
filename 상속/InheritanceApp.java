package 상속;

class Cal{ //더하기 계산을 만든 클래스
    public int sum(int v1, int v2){ //int형 두개를 받아들이고
        return v1+v2; //두개를 더한값을 리턴하는 클래스
    }
}

class Cal3 extends Cal{ //Cal3라는 클래스는 Cal클래스를 확장해서 Cal클래스가 갖고있는 모든 메소드와 변수를 상속받게되는 클래스가 됨.
    public int minus(int v1, int v2){ //int형 두개를 받아들이고
        return v1+v2; //두개를 더한값을 리턴하는 클래스
    }
    public int sum(int v1, int v2){ //부모클래스인 Cal에서 똑같은 메소드에 추가로 내용물을 더할 수도 있음. = 재정의 할 수 있음
        //이런 재정의를 부모가 갖고있는 기능을 덮어쓰기 했다 라는 뜻에서 "Overriding" 라고도 함.
        System.out.println("Cal3!!!");
        return v1+v2;
    }
}

public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal(); //더하기 메소드 사용
        Cal3 c3 = new Cal3(); // Cal3가 Cal 클래스를 상속했기때문에 Cal이 갖는 모든 메소드를 사용 가능함

        System.out.println(c3.minus(3,1)); //결과는 2가 나옴.
        System.out.println(c3.sum(3,1)); // 결과는 4가 나옴.

    }
}
class Cal2{
    public int sum(int v1, int v2){ //int형 두개를 받아들이고
        return v1+v2; //두개를 더한값을 리턴하는 클래스
    }
    public int minus(int v1, int v2){ //int형 두개를 받아들이고
        return v1-v2; //두개를 마이너스값을 리턴하는 클래스
    }
}

//상속은 어떠한 클래스가 있을때 그 클래스가 갖고있는 변수와 메소드를 상속해서 다른 클래스가 갖고도록 하는 것, 재사용성을 높히고, 가독성을 높히고, 코드의 양도 줄이고, 유지보수의 편의성도 높힌다.