package string_Program;

import java.util.Scanner;

public class String_Palindrome {
    public static Boolean checkPallindrome(String str){

        Boolean check=true;
        str=str.toLowerCase();
        int i=0,j=str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                check=false;
                return check;
            }
            i++;
            j--;
        }

        return check;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();

        checkPallindrome(str);
        if(checkPallindrome(str)){
            System.out.println("String is palindrome.");
        }else{
            System.out.println("String is not palindrome.");
        }
    }
}
