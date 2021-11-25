package Final;

class Calculator {
    static final double PI = 3.14; //final 지정을 통해 3.14라는 파이값을 한번 셋팅 이후 바뀌지않는 상수가 되어버림(파이값은 원래 상수니까)
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class FinalMethod {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10;


    }

}
