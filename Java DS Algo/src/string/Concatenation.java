package string;

import java.util.ArrayList;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println('a'+'a');   // in case of character its fetch the asci value then add it
        System.out.println((char)('a'+'a'));
        System.out.println('a'+3);   //  a-- 97(ascii) + 3
        System.out.println((char)('a'+3));
        System.out.println("a"+"A");
        System.out.println("a"+3);
        System.out.println("a"+new ArrayList<>());
    }
}
