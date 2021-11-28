package StringBuilder;

public class test {
    public static void main(String[] args) {
        String str1 = "ABCDEFGHIJKLMN";
        String str2 = "990208-1012752";
        int idx=0;

        StringBuilder strBuf=new StringBuilder(str1);
        strBuf.reverse();
        System.out.println(strBuf);

        StringBuilder strBuf2=new StringBuilder(str2);

        idx = strBuf2.indexOf("-");
        if(idx != -1)
            System.out.println(strBuf2.deleteCharAt(idx).toString());
    }
}
