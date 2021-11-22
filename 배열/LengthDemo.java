package 배열;

public class LengthDemo {
    public static void main(String[] args) {
        //length는 배열을 처음 생성할대 지정한 배열의 크기를 의미.

        String[] classGroup = new String[4];
        classGroup[0] = "이지훈";
        System.out.println(classGroup.length); // 배열의 첫 크기를 출력 - 4
        classGroup[1] = "고동현";
        System.out.println(classGroup.length); // 배열의 첫 크기를 출력 - 4
        classGroup[2] = "송수현";
        System.out.println(classGroup.length); // 배열의 첫 크기를 출력 - 4
        classGroup[3] = "김태원";
        System.out.println(classGroup.length); // 배열의 첫 크기를 출력 - 4


    }
}
