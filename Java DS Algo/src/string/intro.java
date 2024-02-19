package string;

public class intro {
    public static void main(String[] args) {
        String str=new String("Akarsh");
        str.concat("Yadav");
        System.out.println(str);
        String str1="Akarsh";
        str1="Akarsh Yadav";
        System.out.println(str1);

        StringBuffer sb=new StringBuffer("Aakrsh");
        sb.append(" Yadav");
        System.out.println(sb);

         char[] ch=str1.toCharArray();
//         for(char c:ch){
//             System.out.println(c);
//         }

         // comparison of string
        //  ==

        String a="akarsh";
         String b="akarsh";
        System.out.println(a==b);   //true  because bot varible svae in same string pool

        //   equals()

        System.out.println(a.equals(b));

        String aa=null;





    }
}
