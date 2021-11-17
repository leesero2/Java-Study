public class 텔레비전테스트 {
    public static void main(String[] args) {
        텔레비전클래스 tv = new 텔레비전클래스();
        tv.channel = 7;
        tv.volume = 9;
        tv.OnOff = true;
        System.out.println("텔레비전의 채널은 "+ tv.channel + "이고 볼륨은 "+ tv.volume + "입니다. ");
    }
}
