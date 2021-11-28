package StringBuffer;

public class test {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("Hello!");

        System.out.println(s);  // Hello!

        s.deleteCharAt(5);
        System.out.println(s);    // Hello

        s.append(", world!");
        System.out.println(s);   // Hello, world!

        s.insert(7, "my ");
        System.out.println(s);   // Hello, my world!

        String s2 = s.toString();
        System.out.println(s2);   // Hello, my world!

        s.reverse();
        System.out.println(s); // !dlrow ym ,olleH

        s.reverse();
        s.replace(7, 9, "your");
        System.out.println(s); //    Hello, your world!

        s.append("!!"); // --> Hello, your world!!!
        System.out.println(s.length());    // 20
    }

}
