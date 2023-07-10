package string_Program;

import java.util.Scanner;

// reverse  words in a given string.
// Input: this is java programming
//  output : programming java is this
public class Reverse_String2 {
    public static String reverse(String str){
        if(str==null){
            return str;
        }

        String[] words=str.split(" ");

        if(words.length==1){
            return str;
        }

        String reverseword="";
       for(int i=words.length-1;i>=0;i--){
           reverseword=reverseword+words[i]+" ";
       }
        return reverseword.trim();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();

        String reverseString = reverse(str);
        System.out.println(reverseString);
    }

}
