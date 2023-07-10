package string_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Divide_N_equal_Parts {
    public static void N_equalParts(String str,int n){
        int len=str.length();
        int chars=len/n;
        String[] newstr=new String[n];
        int temp=0;

        if(len%n!=0){
            System.out.println("String cannot be divided into n parts");
        }
         else{
             for(int i=0;i<len;i=i+chars){
            String part=str.substring(i,i+chars);
            newstr[temp]=part;
            temp++;
        }
             for(String s:newstr){
                 System.out.print(s+" ");
             }

        }



    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println("Enter the parts : ");
        int n=sc.nextInt();

        N_equalParts(str,n);


    }
}
