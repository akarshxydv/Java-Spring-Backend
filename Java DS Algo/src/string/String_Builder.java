package string;

public class String_Builder {
    public static void main(String[] args) {

        //  when we add something to string its create new object to memory e.g.

        for (int i = 0; i < 26; i++) {
           char a =(char) ('a'+ i);
            System.out.print(a);
        }

        // to tackle this problem we have string builder

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char a =(char) ('a'+ i);
            sb.append(a);
        }
        System.out.println();
        System.out.println(sb.toString());
        System.out.println("a"+10+20);

    }
}