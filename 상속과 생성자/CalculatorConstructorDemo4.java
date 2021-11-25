package 상속과생성자;

class Calculator {
    int left, right;

    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        super(left,right); //하위 클래스의 생성자를 만들어주기위해선 이렇게 상위 클래스의 생성자를 super로 지정해줘야함
        //초기화할 값이 있다면 생성자 아래에 초기화를 해줘야함. 순서가 상위부터 하위이기때문에 super위에 초기화를 하면 안됨.

    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorConstructorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
//출처 - 생활코딩