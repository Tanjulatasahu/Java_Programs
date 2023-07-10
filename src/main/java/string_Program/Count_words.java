package string_Program;

import java.util.Scanner;

public class Count_words {
    public static int count(String str){
        int n=str.length();
        int count=1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();

        int count = count(str);
        System.out.println("Total number of words is :" + count);
    }
}
