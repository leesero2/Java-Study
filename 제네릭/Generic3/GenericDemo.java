package Generic1;

class StudentInfo{
    public int grade;
    StudentInfo(int grade){this.grade = grade;}
}

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){this.rank = rank;}
}

class Person{
    public Object info;
    Person(Object info){this.info = info;}
}

public class GenericDemo {
    public static void main(String[] args) {
        Person p1 = new Person("부장");
        EmployeeInfo ei = (EmployeeInfo)p1.info; //p1.info는 Object타입
        System.out.println(ei.rank);
    }
}
//이와같은 코드는 런타임 에러가 발생함.
//컴파일 언어의 기본은 모든 에러는 컴파일이 발생할 수 있도록 유도해야 한다는것.