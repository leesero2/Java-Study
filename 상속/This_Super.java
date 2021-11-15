package 상속;

//this는 자기자신을 가르키는 것
//super는 부모클래스를 가르키는 것.

class asdf{
    public int sum(int v1,int v2){
        return v1 +v2;
    }
    //Overloading
    public int sum(int v1,int v2,int v3){
        return this.sum(v1,v2) + v3; //자기자신의 sum 함수를 이용한 후 v3을 더함
    }
}

class zxcv extends asdf{
    public int minus(int v1, int v2){
        return v1 - v2;
    }
    //Overriding
    public int sum(int v1, int v2){
        System.out.println("아무거나 적었어요!");
        return  super.sum(v1,v2); //super를 이용해서 부모클래스 asdf에 sum을 갖고옴.
    }
}

public class This_Super {
    public static void main(String[] args) {
        zxcv v = new zxcv();
        System.out.println(v.sum(2,1)); //결과는 3이 나옴.
    }
}
