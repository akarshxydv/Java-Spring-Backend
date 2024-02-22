package string;

public class Test {
    public static String compress(char[] chars) {
        StringBuilder str=new StringBuilder();
        str.append(chars[0]);
        int count=1;
        for(int i=1;i<chars.length-1;i++){
            char curr=chars[i];
            char prev=chars[i-1];
            if(curr == prev){
                count++;
            }else{
                if(count>1) str.append(count);
                str.append(curr);
                count=1;
            }

        }
        if(count>1) str.append(count);
        return str.toString();


    }

    public static void main(String[] args) {
        char [] ch={'a','a','b','b','b','c','c'};
        System.out.println(compress(ch));
    }
}
