package Generic1;
interface Info{
    int getLevel1();
}
class EmployeeInfo implements Info{
    public int rank;
    EmployeeInfo(int rank){this.rank = rank;}
    public int getLevel(){
        return this.rank;
    }
}

class Person<T extends Info>{ //info라는 클래스에 자식들만이 T로 올수있음.
    public T info;
    Person(T info)
    {this.info = info;}
}

public class GenericDemo {
    public static void main(String[] args) {
       Person p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
       Person<String> p2 = new Person<String>("부장");
    }
}
