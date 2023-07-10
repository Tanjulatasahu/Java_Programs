package string_Program;

import java.util.Scanner;
// count character of each word in a given string
// input : this is java programming
// output : this -4, is-2, java-4, programming-11
public class Count_Character_word {
    public static void count(String str){
        if(str.isEmpty()){
            System.out.println("The string is empty.");
        }

        if(str.length()==1){
            System.out.println(str + "  " + 1);
        }

        else{
        String[] s=str.split(" ");
            int count=0;
        for(String word:s) {
            int n = word.length();
            count=count+word.length();

            System.out.println(word + " : " + n);
        }
        System.out.println("Total number of character is : "+ count);
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();

         count(str);

    }
}
