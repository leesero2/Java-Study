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
}

public class GenericDemo {
    public static void main(String[] args) {
        Integer id = new Integer(1);
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1),id); //new EmployeeInfo는 11번줄로 이동.
        System.out.println(p1.id.intValue());
    }
}
