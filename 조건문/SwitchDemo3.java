package 자바조건문;

public class SwitchDemo3 {
    public static void main(String[] args) {
        //default문은 주어진 케이스가 없을때 실행이 됨.
        System.out.println("switch(1");
        switch (1) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
                break;
        }

        System.out.println("switch(2)");
        switch (2){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
                break;
        }

        System.out.println("switch(3)");
        switch (3){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
                break;
        }

    }
}
//출처 - 생활코딩