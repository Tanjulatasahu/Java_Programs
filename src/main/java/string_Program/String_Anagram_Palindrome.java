package string_Program;

import java.util.Arrays;
import java.util.Scanner;
// Given a string, check if the characters of the given string can be rearranged to form a
// pallindrom  or anagram pallindrome
// Input : geeksforgeeks  output: not a pallindrome string
// Input : geeksogeeks    output: pallindrome string


// Algorithm are below-

// 1. Create a frequency array of alphabet size which is 256 . Initialize all values of the
//  frequency array to zero.
//2. Traverse the given string and increment frequency of every character.
// 3. Traverse the frequency array and if the frequency array has more than one odd value, return false.
// otherwise return true. (return true if odd count is 0 or 1)
public class String_Anagram_Palindrome {
    public static Boolean checkPallindrome(String str){
        int total_chars=256;
        int count=0;
        int frequency[]=new int[total_chars];
        Arrays.fill(frequency,0);

        for(int i=0;i<str.length();i++){
            frequency[(int)(str.charAt(i))]++;

        }

        for(int i=0;i<total_chars;i++){
            if(frequency[i]==1){
                count++;
            }
        }
        if(count>1){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();

        checkPallindrome(str);
        if(checkPallindrome(str)){
            System.out.println("String can be a palindrome.");
        }else{
            System.out.println("String cannot be a  palindrome.");
        }
    }
}
