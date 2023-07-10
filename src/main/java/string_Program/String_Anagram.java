package string_Program;

import java.util.Arrays;
import java.util.Scanner;

// Input: silent, listen
//output: string is anagram
public class String_Anagram {

    public static Boolean checkAnagram(String str1,String str2){

        // convert string into lowercase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        // convert string into char array
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        // check the length of the string
        if(arr1.length!=arr2.length){
            return false;
        }
        // sort both the string
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //check the characters of each string
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1 : ");
        String str1=sc.nextLine();
        System.out.println("Enter the string 2 : ");
        String str2=sc.nextLine();

        checkAnagram(str1,str2);
        if(checkAnagram(str1,str2)){
            System.out.println("String is Anagram.");
        }else{
            System.out.println("String is not Anagram.");
        }
    }
}
