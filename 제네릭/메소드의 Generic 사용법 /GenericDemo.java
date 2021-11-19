package Generic1;

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){this.rank = rank;}
}

class Person<T, S>{ //복수의 제네릭은 서로 다른이름으로 구분해야함.
    public T info; //얘는 EmployeeInfo가 됨
    public S id; //S의 위치는 17번줄의 int가 와서 id값은 int가 됨.
    Person(T info,S id)
    {this.info = info; this.id = id;}
    public <U> void printInfo(U info){ //제네릭의 메소드에서만 사용되는 모습을 보여주는 printInfo라는 메소드. 메소드안에서 info라는 매개변수를 사용하는데 아직 데이터타입을 확정하기 싫을때
        System.out.println(info);
    }
}
//접근 제어자 - public private 등등

public class GenericDemo {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10);
        Person p1 = new Person(e, i);
        p1.printInfo(e); //메소드의 제네릭을 적용하는법.
    }
}
