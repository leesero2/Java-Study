package 자바조건문;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //break문을 만나면 switch문이 즉시 중지된다.
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
        }

    }
}
//출처 - 생활코딩