package bitManipulation;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [][] arr=new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
            arr[i][j]=sc.nextInt();
            }
        }

        for(int[] a:arr){
            for(int numm:a){
                System.out.println(numm);
            }
        }
    }
}
