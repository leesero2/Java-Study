package 유효범위;

class C{
    int v = 10;
    void m(){
        int v = 20; //전역변수에 10이 선언이 되었어도 우선순위로 가장 가까운 변수로 지정이됨 출력은 20이 나옴
        System.out.println(v);
        //하지만 전역변수의 값도 출력하고싶으면 this를 사용하면 됨.
        System.out.println(this.v); //10이 출력이 됨. this는 그 객체에대한 전역을 의미
    }
}

public class ScopeDemo7 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
}
//출처 - 생활코딩