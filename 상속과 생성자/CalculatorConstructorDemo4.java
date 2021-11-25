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
    public SubstractionableCalculator(int left, int right) { //super 키워드는 부모 클래스를 의미. 여기에 () 를 붙이면 부모 클래스의 생성자를 의미하게 된다.
        super(left,right); //이렇게 하면 부모 클래스의 기본 생성자가 없어져도 오류가 발생하지 않음.
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