package Generic1;

class StudentInfo{
    public int grade; //인스터스는 grade
    StudentInfo(int grade){this.grade = grade;} //main메소드 보면 StudentInfo생성자에 grade 변수에 2를 준것
}

class StudentPerson{
    public StudentInfo info; //info라는 필드의 데이터
    StudentPerson(StudentInfo info){this.info = info;} //StudentPerson이라는 생성자는 StudentInfo라는 데이터타입에 info라는 매개변수를 받음
}

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){this.rank = rank;} //26번줄 1이라는 값을 통해 rank값이 1인 인스턴스가 만들어짐
}

class EmployeePerson{
    public EmployeePerson info;
    EmployeePerson(EmployeeInfo info){this.info = info;}
}

public class GenericDemo {
    public static void main(String[] args) {
        StudentInfo si = new StudentInfo(2); //인스턴스(grade)가 2라는 값을 갖고 si라는 변수에 담기게 됨.
        StudentPerson sp = new StudentPerson(si); //si는 sp라는 변수에 담기게됨.
        System.out.println(sp.info.grade); //sp라는 인스턴스에 info라는 필드에 grade라는 값을 접근하면 2가 출력이됨.
        EmployeeInfo ei = new EmployeeInfo(1);
        EmployeePerson ep = new EmployeePerson(ei); //13번줄에 1인값이 담긴 인스턴스를 ei라는 변수에 담김. ei는 EmployeePerson라는 생성자로 전달이됨
        System.out.println(ep.info.rank);//1이 출력
    }
}
//이 코드는 StudentPerson과 EmployeePerson은 사실상 똑같은 매커니즘을 가지 코드임.
//공통적인 클래스를 제거하기위해 제네릭을 쓰는것.
