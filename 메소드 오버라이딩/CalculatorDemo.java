package Overriding;

class Calculator{
    int left, right;

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
    public void sum(){
        System.out.println("실행결과는 " + (this.left + this.right) + "입니다.");
    }
    public void substract(){
        System.out.println(this.left - this.right);
    }

    //public int avg(){ 부모 클래스의 메소드에선 return 타입이 void인데 이거는 int로 리턴타입이 되어있기때문에 에러가 일어남.
    //    return (this.left + this.right) / 2;
    //} 메소드 오버라이딩을 할 경우에는 메소드 리턴 형식이 같아야 한다.


    // 메소드의 이름, 메소드 매개변수의 숫자와 데이터 타입 그리고 순서, 메소드의 리턴타입 ( 이 조건을 충족시켜야 메소드 오버라이딩이 가능)
}



public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
        c1.substract();
        //실행하면 결과는 SubstractionableCalculator 에 있는 sum 메소드가 실행이 된다.
        //그 이유는 쉽게 말하면 하위 클래스 입장에서 부모클래스란 기본적인 동작 방법을 정의한 것이라고 할수있다.
        //하위 클래스에서 상위 클래스와 동일한 메소드를 정의하면 부모 클래스로 부터 물려받은 기본 동작 방법을 변경하는 효과를 갖게 된다.
        //이것을 메소드 오버라이딩 이라고 한다.
        //오버라이딩을 하기 위해서는 리턴 타입이 같아야한다.
    }
}
//출처 - 생활코딩.

