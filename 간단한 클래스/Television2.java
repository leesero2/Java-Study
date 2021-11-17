public class Television2 {
    int channel;
    int volume;
    boolean onOff;

    public static void main(String[] args) { //메인메소드를 텔레비전 클래스 안에 넣어도 된다.
        Television2 tv = new Television2();
        tv.channel = 7; //tv가 참조하는 객체로부터 channel이라는 필드에 접근.
        tv.volume = 9;
        tv.onOff = true;

        Television2 tv2 = new Television2(); //객체는 여러게 생성될 수 있다.
        tv2.channel = 17; //tv가 참조하는 객체로부터 channel이라는 필드에 접근.
        tv2.volume = 4;
        tv2.onOff = true;
        System.out.println("텔레비전의 채널은 "+ tv.channel + "이고 볼륨은 "+ tv.volume + "입니다. ");
    }
}
