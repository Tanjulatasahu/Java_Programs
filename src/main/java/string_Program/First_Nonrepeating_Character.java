package string_Program;

import java.util.Scanner;
// find first non-repeating character in a string.
// input : aabac
// output : b
public class First_Nonrepeating_Character {

    public static char nonReapeating(String s){
        // char[] ch=s.toCharArray();


        for(int i=0;i<s.length();i++){
            boolean unique=true;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    unique=false;
                    break;
                }
            }
            if(unique==true){
                return s.charAt(i);

            }
        }
        throw new RuntimeException("didn't find any non repeated character");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();

        char c = nonReapeating(str);
        System.out.println("First non-reapeting charater is : " + c);
    }
}
