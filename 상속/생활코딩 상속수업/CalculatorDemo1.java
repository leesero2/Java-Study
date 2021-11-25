package 상속;

class Calculator{
    int left,right;

    public void setOprands(int left,int right){
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator{
    public void substract(){
        System.out.println(this.left - this.right);
    }
}

class MulitplicationableCalculator extends Calculator{
    public void multiplication(){
        System.out.println(this.left * this.right);
    }
}

class DivisionableCalculator extends MulitplicationableCalculator{
    public void division(){
        System.out.println(this.left / this.right);
    }
}

public class CalculatorDemo1 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.substract();
        c1.avg();

        MulitplicationableCalculator c2 = new MulitplicationableCalculator();
        c2.multiplication();

        DivisionableCalculator c3 = new DivisionableCalculator();
        c3.multiplication();
        c3.division();
    }
}
//출처 - 생활코딩