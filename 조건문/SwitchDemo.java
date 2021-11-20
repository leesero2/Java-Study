package 자바조건문;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("switch(1");
        switch (1) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }

        System.out.println("switch(2)");
        switch (2){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }

        System.out.println("switch(3)");
        switch (3){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }
        //break문이 없으면 case1에서는 3까지 전부 실행이 된다.
    }
}
//출처 - 생활코딩