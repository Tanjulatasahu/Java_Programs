package string_Program;

import java.util.Scanner;

// find first repeating character in a string.
// input : abccb
// output : b
public class First_repeating_character {
    public static char repeating(String s){
        // char[] ch=s.toCharArray();


        for(int i=0;i<s.length();i++){
            boolean unique=true;
            for(int j=i+1;j<s.length();j++){
                if( s.charAt(i)==s.charAt(j)){
                    unique=false;
                    return s.charAt(i);
                }
            }

        }
        throw new RuntimeException("didn't find any repeated character");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();

        char c = repeating(str);
        System.out.println("First reapeting charater is : " + c);
    }
}
