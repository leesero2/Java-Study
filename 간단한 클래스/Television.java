public class Television {
    int channel;
    int volume;
    boolean onOff;

    public static void main(String[] args) { //메인메소드를 텔레비전 클래스 안에 넣어도 된다.
        Television tv = new Television();
        tv.channel = 7; //tv가 참조하는 객체로부터 channel이라는 필드에 접근.
        tv.volume = 9;
        tv.onOff = true;
        System.out.println("텔레비전의 채널은 "+ tv.channel + "이고 볼륨은 "+ tv.volume + "입니다. ");
    }
}
