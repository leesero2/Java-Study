package 초기화와생정자;

class Calculator{
    int left, right;

    //생성자 이름 = 클래스 이름
    public Calculator(int left, int right){//메소드 이름은 클래스랑 동일해야함(중요) left,right = 매개변수
        this.left = left; //this는 전역변수를 가르킴 - 전역변수 left = 매개변수 left라고 지정한것.
        this.right = right;
    }
    //클래스가 생성될때 자동으로 클래스와 똑같은 이름을 갖는 생성자가 그 어떤 메소드보다 먼저 실행되도록 약속되어있음.
    public void sum(){
        System.out.println(this.left + this.right);//this에 의해 전역변수를 사용하는것
    }

    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo1 {
    public static void main(String[] args) {

        Calculator c1 = new Calculator(10,20);//여기서 데이터값(10,20)은 인자
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(20,30);
        c2.sum();
        c2.avg();
    }
}
//출처 - 생활코딩