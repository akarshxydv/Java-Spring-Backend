package string;

import java.util.Arrays;

public class SubString {
    public static void main(String[] args) {
        String str="sdfidijdmckmdmfgrmkdd  dfvmiv emife vdkf";
        StringBuilder sb=new StringBuilder();
        sb.append(str.substring(7,str.length()));
        sb.append(str, 0, 7);
        System.out.println(sb);
        System.out.println(sb.length()==str.length());
        char [] ch={'a','b','c'};
        StringBuilder sb1=new StringBuilder();
        sb1.append(ch[0]);
        System.out.println(sb1);
    }
}
